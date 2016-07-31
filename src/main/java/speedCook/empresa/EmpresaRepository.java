package speedCook.empresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

	public EmpresaEntity findByEmail(String email);

}
