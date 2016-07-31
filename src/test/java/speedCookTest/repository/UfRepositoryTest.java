package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.uf.UfEntity;
import speedCook.uf.UfRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class UfRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UfRepository repository;

	//Teste tabela UF
	@Test
	public void testFindAll() {
		List<UfEntity> ufs = this.repository.findAll();

		logger.info(ufs + "");
	}

	@Test
	public void testFindSigla(){
		UfEntity uf = repository.findBySigla("MG");

		logger.info(uf + "");
	}

}
