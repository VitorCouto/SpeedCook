package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.logradouro.LogradouroEntity;
import speedCook.logradouro.LogradouroRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class LogradouroRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private LogradouroRepository repository;

	@Test
	public void testFindAll(){
		List<LogradouroEntity> logradouros = this.repository.findAll();

		logger.info(logradouros + "");
	}

	@Test
	public void testFindByCep() {
		LogradouroEntity logradouros = this.repository.findByCep("38408272");

		logger.info(logradouros + "");
	}

	@Test
	public void testFindByCepBetween() {
		LogradouroEntity logradouros = this.repository.findByCepBetween("38408272", "38408278");

		logger.info(logradouros + "");
	}

}
