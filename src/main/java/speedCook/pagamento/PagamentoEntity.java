package speedCook.pagamento;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.pedido.PedidoEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_pagamento")
@AttributeOverride(name = "id", column = @Column(name = "idpagamento") )
public class PagamentoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@ManyToOne
	@JoinColumn(name = "codpedido")
	private PedidoEntity pedido;

	@Column(name = "datapagamento", nullable = false)
	private Date datapagamento;

	public PagamentoEntity() {
		super();
	}

	public PagamentoEntity(PedidoEntity pedido, Date datapagamento) {
		super();
		this.pedido = pedido;
		this.datapagamento = datapagamento;
	}

	public PedidoEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}

	public Date getDatapagamento() {
		return datapagamento;
	}

	public void setDatapagamento(Date datapagamento) {
		this.datapagamento = datapagamento;
	}

}
