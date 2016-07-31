package speedCook.permissao;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_permissao")
@AttributeOverride(name = "id", column = @Column(name = "id") )
public class PermissaoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	private String role;

	public PermissaoEntity() {
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
