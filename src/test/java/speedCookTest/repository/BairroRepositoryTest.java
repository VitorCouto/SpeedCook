package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.bairro.BairroEntity;
import speedCook.bairro.BairroRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class BairroRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private BairroRepository bairroRepository;

	//Teste tabela UF
	@Test
	public void testFindAll() {
		List<BairroEntity> bairros = this.bairroRepository.findAll();

		logger.info(bairros + "");
	}



}
