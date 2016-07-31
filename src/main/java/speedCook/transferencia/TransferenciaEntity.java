package speedCook.transferencia;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.pagamento.PagamentoEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_transferencia")
@AttributeOverride(name = "id", column = @Column(name = "idtransferencia") )
public class TransferenciaEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(length = 255, nullable = false, unique = true)
	private String banco;

	@Column(length = 10, nullable = false, unique = true)
	private String conta;

	@Column(length = 10, nullable = false, unique = true)
	private String agencia;

	@ManyToOne
	@JoinColumn(name = "codpagamento")
	private PagamentoEntity pagamento;

	public TransferenciaEntity() {
		super();
	}

	public TransferenciaEntity(String banco, String conta, String agencia, PagamentoEntity pagamento) {
		super();
		this.banco = banco;
		this.conta = conta;
		this.agencia = agencia;
		this.pagamento = pagamento;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public PagamentoEntity getPagamento() {
		return pagamento;
	}

	public void setPagamento(PagamentoEntity pagamento) {
		this.pagamento = pagamento;
	}

}
