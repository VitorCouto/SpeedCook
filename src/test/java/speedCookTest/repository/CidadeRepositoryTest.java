package speedCookTest.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import speedCook.cidade.CidadeEntity;
import speedCook.cidade.CidadeRepository;
import speedCook.uf.UfEntity;
import speedCook.uf.UfRepository;
import speedCookTest.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppContextTest.class)
public class CidadeRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private UfRepository ufRepository;

	//busca todos os valores
	@Test
	public void testFindAll() {
		List<CidadeEntity> cidades = this.cidadeRepository.findAll();

		logger.info(cidades + "");
	}

	//adiciona valor
	@Test
	public void testAdd() {
		String nome = "Teste";
		UfEntity uf = ufRepository.findBySigla("MG");

		CidadeEntity cidade = new CidadeEntity(nome, uf);

		cidade = this.cidadeRepository.save(cidade);

		logger.info(cidade + "");
	}

	//busca por cidade
	@Test
	public void testFindCidade(){
		CidadeEntity cidadess = cidadeRepository.findByNome("Goias");

		logger.info(cidadess + "");
	}


}
