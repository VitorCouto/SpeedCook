package speedCook.empresa;

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
@RequestMapping(path= ServicePath.EMPRESA_PATH)
public class EmpresaController extends GenericService<EmpresaEntity, Long> {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private PermissaoRepository permissaoRepository;

	@Override
	public EmpresaEntity insert(@RequestBody EmpresaEntity entityObject) {
		entityObject.setDatacad(new Date());
		entityObject.setPassword(this.passwordEncoder.encode(entityObject.getPassword()));
		entityObject.setPermissoes(permissaoRepository.findByRole("ROLE_EMPRESA"));

		return super.insert(entityObject);
	}

	@Override
	public void update(@RequestBody EmpresaEntity entityObject) {
		entityObject.setPassword(this.passwordEncoder.encode(entityObject.getPassword()));

		super.update(entityObject);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/empresa")
	public EmpresaEntity findByEmpresa(@RequestParam("id") long id) {
		return this.empresaRepository.findOne(id);
	}

	//	@RequestMapping(method = RequestMethod.GET, path = "/empresa")
	//	public EmpresaEntity findByEmpresa(@RequestParam("id") long id) {
	//		return this.empresaRepository.findOne(id);
	//	}

}
