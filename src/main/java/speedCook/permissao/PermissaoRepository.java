package speedCook.permissao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {

	public List<PermissaoEntity> findByRole(String role);

}
