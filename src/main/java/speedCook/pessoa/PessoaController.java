package speedCook.pessoa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import speedCook.permissao.PermissaoRepository;
import speedCook.utils.GenericService;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PESSOA_PATH)
public class PessoaController extends GenericService<PessoaEntity, Long>{

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private PermissaoRepository permissaoRepository;

	@Override
	public PessoaEntity insert(@RequestBody PessoaEntity entityObject) {
		entityObject.setDatacad(new Date());
		entityObject.setPassword(this.passwordEncoder.encode(entityObject.getPassword()));
		entityObject.setPermissoes(permissaoRepository.findByRole("ROLE_USUARIO"));

		return super.insert(entityObject);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/email")
	public PessoaEntity findByEmail(@RequestParam("email") String email){
		return this.pessoaRepository.findByEmail(email);
	}

	@Override
	public void update(PessoaEntity entityObject) {
		entityObject.setPassword(this.passwordEncoder.encode(entityObject.getPassword()));

		super.update(entityObject);
	}

}
