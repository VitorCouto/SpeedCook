package speedCook.logradouro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LogradouroRepository extends JpaRepository<LogradouroEntity,Long> {

	public LogradouroEntity findByCep(String cep);

	public LogradouroEntity findByCepBetween(String cepInicial, String cepFinal);

}
