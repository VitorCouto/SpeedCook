package speedCook.seguranca;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

import speedCook.utils.ServicePath;

@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {

	public static final String AUTH_USUARIO = "ROLE_USUARIO";

	public static final String AUTH_ADMIN = "ROLE_ADMIN";

	public static final String AUTH_EMPRESA = "ROLE_EMPRESA";

	@Autowired
	private UserDetailsService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.userService).passwordEncoder(this.passwordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
		// Global Authority to OPTIONS (permit all).
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		// Public (permit all).
		.antMatchers(ServicePath.PUBLIC_ROOT_PATH + ServicePath.ALL).permitAll()
		//		.antMatchers("/empresa/**").permitAll()
		//		.antMatchers("/logradouro/**").permitAll()
		//		.antMatchers("/pessoa/**").permitAll()
		//		.antMatchers("/itensPedido/**").permitAll()

		// User Authorities.
		.antMatchers(HttpMethod.GET, ServicePath.PESSOA_PATH).permitAll()
		.antMatchers(HttpMethod.POST, ServicePath.PESSOA_PATH).permitAll()
		.antMatchers(HttpMethod.PUT, ServicePath.PESSOA_PATH).hasAnyAuthority(AUTH_ADMIN, AUTH_USUARIO)
		.antMatchers(HttpMethod.DELETE, ServicePath.PESSOA_PATH).hasAnyAuthority(AUTH_ADMIN, AUTH_USUARIO)

		// Pedido
		.antMatchers(HttpMethod.GET, ServicePath.PEDIDO_PATH).hasAnyAuthority(AUTH_ADMIN, AUTH_USUARIO, AUTH_EMPRESA)
		.antMatchers(HttpMethod.POST, ServicePath.PEDIDO_PATH).hasAnyAuthority(AUTH_ADMIN, AUTH_USUARIO, AUTH_EMPRESA)
		.antMatchers(HttpMethod.PUT, ServicePath.PEDIDO_PATH).hasAnyAuthority(AUTH_ADMIN, AUTH_USUARIO, AUTH_EMPRESA)
		.antMatchers(HttpMethod.DELETE, ServicePath.PEDIDO_PATH).hasAnyAuthority(AUTH_ADMIN, AUTH_USUARIO, AUTH_EMPRESA)

		.antMatchers(HttpMethod.GET, ServicePath.PEDIDO_USER_PATH).permitAll()

		.antMatchers(HttpMethod.GET, ServicePath.PEDIDO_EMPRESA_PATH).permitAll()

		// itensPedido
		.antMatchers(HttpMethod.GET, ServicePath.ITENSPEDIDO_PATH).hasAnyAuthority(AUTH_USUARIO, AUTH_EMPRESA, AUTH_ADMIN)
		.antMatchers(HttpMethod.POST, ServicePath.ITENSPEDIDO_PATH).hasAnyAuthority(AUTH_USUARIO, AUTH_EMPRESA, AUTH_ADMIN)
		.antMatchers(HttpMethod.PUT, ServicePath.ITENSPEDIDO_PATH).hasAnyAuthority(AUTH_USUARIO, AUTH_EMPRESA, AUTH_ADMIN)
		.antMatchers(HttpMethod.DELETE, ServicePath.ITENSPEDIDO_PATH).hasAnyAuthority(AUTH_USUARIO, AUTH_EMPRESA, AUTH_ADMIN)

		.antMatchers(HttpMethod.GET, ServicePath.ITENSPEDIDO_ID_PATH).permitAll()

		//produto
		.antMatchers(HttpMethod.GET, ServicePath.PRODUTO_PATH).permitAll()
		.antMatchers(HttpMethod.POST, ServicePath.PRODUTO_PATH).hasAnyAuthority(AUTH_EMPRESA, AUTH_ADMIN)
		.antMatchers(HttpMethod.PUT, ServicePath.PRODUTO_PATH).hasAnyAuthority(AUTH_EMPRESA, AUTH_ADMIN)
		.antMatchers(HttpMethod.DELETE, ServicePath.PRODUTO_PATH).hasAnyAuthority(AUTH_EMPRESA, AUTH_ADMIN)

		//empresa
		.antMatchers(HttpMethod.GET, ServicePath.EMPRESA_PATH).permitAll()
		.antMatchers(HttpMethod.POST, ServicePath.EMPRESA_PATH).permitAll()
		.antMatchers(HttpMethod.PUT, ServicePath.EMPRESA_PATH).hasAnyAuthority(AUTH_EMPRESA, AUTH_ADMIN)
		.antMatchers(HttpMethod.DELETE, ServicePath.EMPRESA_PATH).hasAnyAuthority(AUTH_EMPRESA, AUTH_ADMIN)

		.antMatchers(HttpMethod.GET, ServicePath.EMPRESA_ID_PATH).permitAll()

		//status
		.antMatchers(HttpMethod.GET, ServicePath.STATUS_PATH).permitAll()

		// Permission Authorities.
		.antMatchers(HttpMethod.GET, ServicePath.PERMISSION_PATH).hasAnyAuthority(AUTH_ADMIN)
		.anyRequest().fullyAuthenticated().and()
		// Logout configuration.
		.logout().logoutRequestMatcher(new AntPathRequestMatcher(ServicePath.LOGOUT_PATH))
		.logoutSuccessHandler(new LogoutHandler()).and()
		// CSRF configuration.
		.csrf().csrfTokenRepository(csrfTokenRepository()).and()
		.addFilterAfter(csrfHeaderFilter(), CsrfFilter.class);
	}

	private CsrfTokenRepository csrfTokenRepository() {
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName("X-XSRF-TOKEN");
		return repository;
	}

	private Filter csrfHeaderFilter() {
		return new OncePerRequestFilter() {

			@Override
			protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
					FilterChain filterChain) throws ServletException, IOException {
				CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());

				if (csrf != null) {
					Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
					String token = csrf.getToken();

					if (cookie == null || token != null && !token.equals(cookie.getValue())) {
						cookie = new Cookie("XSRF-TOKEN", token);
						cookie.setPath("/");
						response.addCookie(cookie);
					}
				}

				filterChain.doFilter(request, response);
			}

		};
	}

}
