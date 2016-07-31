package speedCook.logradouro;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.bairro.BairroEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_logradouro")
@AttributeOverride(name = "id", column = @Column(name = "idrua") )
public class LogradouroEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(nullable = false)
	private String nome;

	@Column(length = 15, nullable = false, unique=true)
	private String cep;

	@ManyToOne
	@JoinColumn(name = "codbairro")
	private BairroEntity bairro;

	@Column(name = "tipologradouro")
	private Integer tipologradouro;

	public LogradouroEntity() {
		super();
	}

	public LogradouroEntity(String nome, String cep, BairroEntity bairro, Integer tipologradouro) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.bairro = bairro;
		this.tipologradouro = tipologradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public BairroEntity getBairro() {
		return bairro;
	}

	public void setBairro(BairroEntity bairro) {
		this.bairro = bairro;
	}

	public Integer getTipologradouro() {
		return tipologradouro;
	}

	public void setTipologradouro(Integer tipologradouro) {
		this.tipologradouro = tipologradouro;
	}

}
