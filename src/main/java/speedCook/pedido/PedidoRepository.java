package speedCook.pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import speedCook.empresa.EmpresaEntity;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

	public List<PedidoEntity> findByPessoaEmail (String email);

	public List<EmpresaEntity> findByEmpresaEmail (String email);

}
