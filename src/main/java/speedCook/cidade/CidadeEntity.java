package speedCook.cidade;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.uf.UfEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_cidade")
@AttributeOverride(name = "id", column = @Column(name = "idcidade") )
public class CidadeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(nullable = false)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "coduf")
	private UfEntity uf;

	public CidadeEntity() {
		super();
	}

	public CidadeEntity(String nome, UfEntity uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UfEntity getUf() {
		return uf;
	}

	public void setUf(UfEntity uf) {
		this.uf = uf;
	}

}
