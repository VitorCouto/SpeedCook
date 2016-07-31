package speedCook.sexo;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_sexo")
@AttributeOverride(name = "id", column = @Column(name = "id") )
public class SexoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(name = "sexo", length = 45, nullable = false, unique = true)
	private String nome;

	@Column(name = "sigla", length = 1, nullable = false, unique = true)
	private String sigla;

	public SexoEntity() {
		super();
	}

	public SexoEntity(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
