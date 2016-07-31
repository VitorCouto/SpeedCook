package speedCook.empresa;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import speedCook.logradouro.LogradouroEntity;
import speedCook.permissao.PermissaoEntity;
import speedCook.produto.ProdutoEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_empresa")
@AttributeOverride(name = "id", column = @Column(name = "idempresa") )
public class EmpresaEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(name = "razaosocial", length = 255, nullable = false, unique = true)
	private String razaosocial;

	@Column(name = "fantasia", length = 255, nullable = false, unique = true)
	private String fantasia;

	@Column(name = "datacad", nullable = false)
	private Date datacad;

	@Column(name = "telefone", nullable = false)
	private String telefone;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "numendereco", nullable = false)
	private Integer numendereco;

	@Column(name = "compendereco", nullable = false, unique = true)
	private String compendereco;

	@Column(name = "cnpj", length = 20, nullable = false, unique = true)
	private String cnpj;

	@Column(name = "logomarca", unique = true)
	private String logomarca;

	@Column(name = "taxaentrega", unique = true)
	private Double taxaentrega;

	@Column(name = "sobreempresa", length = 255)
	private String sobreempresa;

	@ManyToOne
	@JoinColumn(name = "codlogradouro")
	private LogradouroEntity logradouro;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "codempresa")
	private List<ProdutoEntity> produtosEmpresa;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tab_empresa_permissao",
	joinColumns = @JoinColumn(name = "empresa_id"),
	inverseJoinColumns = @JoinColumn(name = "permissao_id"))
	private List<PermissaoEntity> permissoes;

	public EmpresaEntity() {
		super();
	}

	public EmpresaEntity(String razaosocial, String fantasia, Date datacad, String telefone, String email,
			String password, Integer numendereco, String compendereco, String cnpj, String logomarca,
			Double taxaentrega, String sobreempresa, LogradouroEntity logradouro, List<ProdutoEntity> produtosEmpresa) {
		super();
		this.razaosocial = razaosocial;
		this.fantasia = fantasia;
		this.datacad = datacad;
		this.telefone = telefone;
		this.email = email;
		this.password = password;
		this.numendereco = numendereco;
		this.compendereco = compendereco;
		this.cnpj = cnpj;
		this.logomarca = logomarca;
		this.taxaentrega = taxaentrega;
		this.sobreempresa = sobreempresa;
		this.logradouro = logradouro;
		this.produtosEmpresa = produtosEmpresa;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public Date getDatacad() {
		return datacad;
	}

	public void setDatacad(Date datacad) {
		this.datacad = datacad;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getNumendereco() {
		return numendereco;
	}

	public void setNumendereco(Integer numendereco) {
		this.numendereco = numendereco;
	}

	public String getCompendereco() {
		return compendereco;
	}

	public void setCompendereco(String compendereco) {
		this.compendereco = compendereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getLogomarca() {
		return logomarca;
	}

	public void setLogomarca(String logomarca) {
		this.logomarca = logomarca;
	}

	public Double getTaxaentrega() {
		return taxaentrega;
	}

	public void setTaxaentrega(Double taxaentrega) {
		this.taxaentrega = taxaentrega;
	}

	public LogradouroEntity getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroEntity logradouro) {
		this.logradouro = logradouro;
	}

	public List<ProdutoEntity> getProdutosEmpresa() {
		return produtosEmpresa;
	}

	public void setProdutosEmpresa(List<ProdutoEntity> produtosEmpresa) {
		this.produtosEmpresa = produtosEmpresa;
	}

	public void setSobreempresa(String sobreempresa) {
		this.sobreempresa = sobreempresa;
	}

	public String getSobreempresa() {
		return sobreempresa;
	}

	public List<PermissaoEntity> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<PermissaoEntity> permissoes) {
		this.permissoes = permissoes;
	}

}
