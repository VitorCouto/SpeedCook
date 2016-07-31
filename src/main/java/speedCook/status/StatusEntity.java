package speedCook.status;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_status")
@AttributeOverride(name = "id", column = @Column(name = "idstatus") )
public class StatusEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private String status;

	public StatusEntity() {
		super();
	}

	public StatusEntity(String descricao, String status) {
		super();
		this.descricao = descricao;
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
