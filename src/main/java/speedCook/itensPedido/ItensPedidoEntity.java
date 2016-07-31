package speedCook.itensPedido;

import javax.persistence.Entity;
import javax.persistence.Table;

import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_itenspedido")
public class ItensPedidoEntity extends BaseEntity<ItensPedidoKeyEntity> {

	private static final long serialVersionUID = 201602010251L;

	private Integer quantidade;

	private Double valor;

	private Double total;

	public ItensPedidoEntity() {
		super();
	}

	public ItensPedidoEntity(Integer quantidade, Double valor, Double total) {
		super();
		this.quantidade = quantidade;
		this.valor = valor;
		this.total = total;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
