package speedCook.produto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PRODUTO_PATH)
public class ProdutoController extends GenericService<ProdutoEntity, Long>{

}
