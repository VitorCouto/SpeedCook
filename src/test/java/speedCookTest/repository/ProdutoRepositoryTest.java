package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.produto.ProdutoEntity;
import speedCook.produto.ProdutoRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class ProdutoRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ProdutoRepository repository;

	@Test
	public void testFindAll() {
		List<ProdutoEntity> produtos = this.repository.findAll();

		logger.info(produtos + "");
	}

	//	@Test
	//	public void testAdd() {
	//		String nome = "TEste";
	//		Double valor = 0.0d;
	//		Integer quantidade = 10;
	//		String descricao = "Descricao";
	//		Blob foto = null;
	//
	//		ProdutoEntity produto = new ProdutoEntity(nome, valor, quantidade, descricao, foto);
	//
	//		this.repository.save(produto);
	//	}

}
