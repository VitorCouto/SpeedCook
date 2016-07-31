package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.aprazo.AprazoEntity;
import speedCook.aprazo.AprazoRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class AprazoRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AprazoRepository aprazoRepository;

	@Test
	public void testFindAll() {
		List<AprazoEntity> prazos = this.aprazoRepository.findAll();

		logger.info(prazos + "");
	}

}
