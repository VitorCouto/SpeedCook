//package speedCook.empresaProduto;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import speedCook.utils.GenericService;
//
//@RestController
//@RequestMapping(path="/empresaProduto")
//public class EmpresaProdutoController extends GenericService<ProdutoEntity, EmpresaProdutoKeyEntity>{
//
//	@Autowired
//	private EmpresaProdutoRepository empresaProdutoRepository;
//
//	@RequestMapping(method = RequestMethod.GET, path = "/empresa")
//	public List<ProdutoEntity> findByEmpresa(@RequestParam("id") long id) {
//		return empresaProdutoRepository.findByIdCodEmpresa(id);
//	}
//
//}
