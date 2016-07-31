package speedCook.bairro;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.cidade.CidadeEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_bairro")
@AttributeOverride(name = "id", column = @Column(name = "idbairro") )
public class BairroEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	private String nome;

	@ManyToOne
	@JoinColumn(name = "codcidade")
	private CidadeEntity cidade;

	public BairroEntity() {
		super();
	}

	public BairroEntity(String nome, CidadeEntity cidade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CidadeEntity getCidade() {
		return cidade;
	}

	public void setCidade(CidadeEntity cidade) {
		this.cidade = cidade;
	}

}
