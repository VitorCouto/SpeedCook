package speedCook.seguranca;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import speedCook.empresa.EmpresaEntity;
import speedCook.empresa.EmpresaRepository;
import speedCook.permissao.PermissaoEntity;
import speedCook.pessoa.PessoaEntity;
import speedCook.pessoa.PessoaRepository;

@Component
public class UserDetail implements UserDetailsService {

	private static final String TIPO_LOGIN_EMPRESA = "empresa";

	private static final String TIPO_LOGIN_PESSOA = "pessoa";

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		EmpresaEntity empresa = empresaRepository.findByEmail(email);

		if (empresa != null) {
			return loginPorEmpresa(empresa);
		}

		PessoaEntity pessoa = pessoaRepository.findByEmail(email);

		if (pessoa != null) {
			return loginPorPessoa(pessoa);
		}

		throw new UsernameNotFoundException("User with email \"" + email + "\" was not found.");
	}

	private UserDetails loginPorPessoa(PessoaEntity pessoa) {
		LoginDetailBean login = new LoginDetailBean(pessoa.getNome(), pessoa.getEmail(),
				pessoa.getPassword(), TIPO_LOGIN_PESSOA);

		for (PermissaoEntity permission : pessoa.getPermissoes()) {
			login.addRole(permission.getRole());
		}

		return login;
	}

	private UserDetails loginPorEmpresa(EmpresaEntity empresa) {
		LoginDetailBean login = new LoginDetailBean(empresa.getFantasia(), empresa.getEmail(),
				empresa.getPassword(), TIPO_LOGIN_EMPRESA);

		for (PermissaoEntity permission : empresa.getPermissoes()) {
			login.addRole(permission.getRole());
		}

		return login;
	}

}
