package speedCook.cidade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<CidadeEntity, Long>{

	public CidadeEntity findByNome (String nome);

}
