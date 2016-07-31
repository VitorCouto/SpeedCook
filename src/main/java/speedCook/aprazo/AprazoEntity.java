package speedCook.aprazo;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.pagamento.PagamentoEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_aprazo")
@AttributeOverride(name = "id", column = @Column(name = "idaprazo") )
public class AprazoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	private String numcartao;

	private Date datavencimento;

	private Integer codseguranca;

	@ManyToOne
	@JoinColumn(name = "codpagamento")
	private PagamentoEntity pagamento;

	public AprazoEntity() {
		super();
	}

	public AprazoEntity(String numcartao, Date datavencimento, Integer codseguranca, PagamentoEntity pagamento) {
		super();
		this.numcartao = numcartao;
		this.datavencimento = datavencimento;
		this.codseguranca = codseguranca;
		this.pagamento = pagamento;
	}

	public String getNumcartao() {
		return numcartao;
	}

	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}

	public Date getDatavencimento() {
		return datavencimento;
	}

	public void setDatavencimento(Date datavencimento) {
		this.datavencimento = datavencimento;
	}

	public Integer getCodseguranca() {
		return codseguranca;
	}

	public void setCodseguranca(Integer codseguranca) {
		this.codseguranca = codseguranca;
	}

	public PagamentoEntity getPagamento() {
		return pagamento;
	}

	public void setPagamento(PagamentoEntity pagamento) {
		this.pagamento = pagamento;
	}

}
