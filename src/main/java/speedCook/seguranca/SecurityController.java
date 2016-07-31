package speedCook.seguranca;


import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.ServiceMap;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(ServicePath.LOGIN_PATH)
public class SecurityController implements ServiceMap {

	@RequestMapping(method = { RequestMethod.GET })
	public Principal user(Principal user) {
		return user;
	}

}
