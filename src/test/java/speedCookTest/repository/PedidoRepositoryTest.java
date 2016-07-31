package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.pedido.PedidoEntity;
import speedCook.pedido.PedidoRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class PedidoRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PedidoRepository repository;

	//	@Autowired
	//	private CurrentUser currentUser;
	//
	//	@Autowired
	//	private PedidoRepository pedidoRepository;

	@Test
	public void testFindAll() {
		List<PedidoEntity> pedidos = this.repository.findAll();

		logger.info(pedidos + "");
	}

	//	@RequestMapping(path = "/byuser", method = RequestMethod.GET)
	//	public List<PedidoEntity> buscaPedidosDoClienteLogado () {
	//		return this.pedidoRepository.findByPessoaEmail(currentUser.getActiveUser().getEmail());
	//	}

}
