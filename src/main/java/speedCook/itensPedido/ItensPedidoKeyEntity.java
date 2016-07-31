package speedCook.itensPedido;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import speedCook.pedido.PedidoEntity;
import speedCook.produto.ProdutoEntity;
import speedCook.utils.BaseKey;

@Embeddable
public class ItensPedidoKeyEntity extends BaseKey {

	private static final long serialVersionUID = 2504515484563802771L;

	@ManyToOne
	@JoinColumn(name = "codpedido")
	private PedidoEntity pedido;

	@ManyToOne
	@JoinColumn(name = "codproduto")
	private ProdutoEntity produto;

	public ItensPedidoKeyEntity() {
		super();
	}

	public ItensPedidoKeyEntity(PedidoEntity pedido, ProdutoEntity produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}

	public PedidoEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}

	public ProdutoEntity getProduto() {
		return produto;
	}

	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}

}
