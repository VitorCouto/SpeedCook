package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.empresa.EmpresaEntity;
import speedCook.empresa.EmpresaRepository;
import speedCook.logradouro.LogradouroRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class EmpresaRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmpresaRepository repository;

	@Autowired
	private LogradouroRepository logradouroRepository;

	@Test
	public void testFindAll(){
		List<EmpresaEntity> empresas = this.repository.findAll();

		logger.info(empresas + "");
	}

	//	@Test
	//	public void testAdd() {
	//		String razaosocial = "Razao";
	//		String fantasia = "Fantasia";
	//		Date datacad = new Date();
	//		String telefone= "(34)9999-4444";
	//		String email = "email@email.com";
	//		String password = "123456";
	//		Integer numendereco = 10;
	//		String compendereco = "Complemento";
	//		String cnpj = "000.000.000-11";
	//		String logomarca = "Logomarca";
	//		LogradouroEntity logradouro = logradouroRepository.findAll(new PageRequest(0, 1)).iterator().next();
	//
	//		EmpresaEntity empresa = new EmpresaEntity(razaosocial, fantasia, datacad, telefone,
	//				email, password, numendereco, compendereco, cnpj, logomarca, logradouro, null);
	//
	//		empresa = this.repository.save(empresa);
	//
	//		logger.info(empresa + "");
	//	}
}
