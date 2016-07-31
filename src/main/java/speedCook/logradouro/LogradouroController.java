package speedCook.logradouro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;

@RestController
@RequestMapping(path="/logradouro")
public class LogradouroController extends GenericService<LogradouroEntity, Long>{

	@Autowired
	private LogradouroRepository logradouroRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/cep")
	public LogradouroEntity findByCep(@RequestParam("cep") String cep) {
		return this.logradouroRepository.findByCep(cep);
	}

}
