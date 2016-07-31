package speedCook.avista;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.pagamento.PagamentoEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_avista")
@AttributeOverride(name = "id", column = @Column(name = "idavista") )
public class AvistaEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(length = 16, nullable = false)
	private String numcartao;

	@Column(length = 45, nullable = false)
	private String bandeira;

	@Column(length = 11, nullable = false)
	private String cpf;

	@ManyToOne
	@JoinColumn(name = "codpagamento")
	private PagamentoEntity pagamento;

	public AvistaEntity() {
		super();
	}

	public AvistaEntity(String numcartao, String bandeira, String cpf, PagamentoEntity pagamento) {
		super();
		this.numcartao = numcartao;
		this.bandeira = bandeira;
		this.cpf = cpf;
		this.pagamento = pagamento;
	}

	public String getNumcartao() {
		return numcartao;
	}

	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}