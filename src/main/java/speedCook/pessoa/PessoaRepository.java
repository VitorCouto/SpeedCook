package speedCook.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

	public PessoaEntity findByEmail (String email);

}
