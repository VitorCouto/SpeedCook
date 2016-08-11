package speedCook.itensPedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidoRepository extends JpaRepository<ItensPedidoEntity, ItensPedidoKeyEntity> {

	public List<ItensPedidoEntity> findByIdPedidoId(Long id);

}
