package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.avista.AvistaEntity;
import speedCook.avista.AvistaRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class AvistaRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AvistaRepository repository;

	@Test
	public void testFindAll() {
		List<AvistaEntity> avistas = this.repository.findAll();

		logger.info(avistas + "");
	}
}
