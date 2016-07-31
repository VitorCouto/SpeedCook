package speedCook.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import speedCook.empresa.EmpresaEntity;
import speedCook.itensPedido.ItensPedidoRepository;
import speedCook.seguranca.CurrentUser;
import speedCook.utils.GenericService;
import speedCook.utils.ServicePath;

@RestController
@RequestMapping(path= ServicePath.PEDIDO_PATH)
public class PedidoController extends GenericService<PedidoEntity, Long> {

	@Autowired
	private CurrentUser currentUser;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private ItensPedidoRepository itensPedidoRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/byuser")
	public List<PedidoEntity> buscaPedidosDoClienteLogado () {
		return this.pedidoRepository.findByPessoaEmail(currentUser.getActiveUser().getEmail());
	}

	@RequestMapping(method = RequestMethod.GET, path = "/byempresa")
	public List<EmpresaEntity> buscaPedidosDaEmpresaLogado () {
		return this.pedidoRepository.findByEmpresaEmail(currentUser.getActiveUser().getEmail());
	}

}
