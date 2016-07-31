package speedCook.itensPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import speedCook.utils.GenericService;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(path= ServicePath.ITENSPEDIDO_PATH)
public class ItensPedidoController extends GenericService<ItensPedidoEntity, ItensPedidoKeyEntity>{

	@Autowired
	private ItensPedidoRepository itensPedidoRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/pedido")
	public ItensPedidoEntity findByPedido (@RequestParam("id") ItensPedidoKeyEntity id){
		return this.itensPedidoRepository.findOne(id);
	}

}
