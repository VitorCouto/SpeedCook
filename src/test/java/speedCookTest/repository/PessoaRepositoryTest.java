package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.pessoa.PessoaEntity;
import speedCook.pessoa.PessoaRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class PessoaRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PessoaRepository repository;

	@Test
	public void testFindAll() {
		List<PessoaEntity> pessoas = this.repository.findAll();

		logger.info(pessoas + "");
	}

	@Test
	public void testFindByEmail() {
		PessoaEntity emails = this.repository.findByEmail("a@gmail.com");

		if (emails == null){
			logger.info("Email nao cadastrado");
		} else {
			logger.info(emails + "");
		}

		//		logger.info(emails + "");
	}

}
