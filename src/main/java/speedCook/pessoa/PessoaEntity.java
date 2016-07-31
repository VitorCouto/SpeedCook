package speedCook.pessoa;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import speedCook.logradouro.LogradouroEntity;
import speedCook.permissao.PermissaoEntity;
import speedCook.sexo.SexoEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_pessoa")
@AttributeOverride(name = "id", column = @Column(name = "idpessoa") )
public class PessoaEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false, unique = true)
	private String sobrenome;

	@Column(nullable = false)
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date datanasc;

	private String telefone;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datacad;

	@Column(nullable = false)
	private String password;

	@ManyToOne
	@JoinColumn(name = "codlogradouro")
	private LogradouroEntity logradouro;

	@Column(nullable = false)
	private String numendereco;

	private String compendereco;

	@ManyToOne
	@JoinColumn(name = "codsexo")
	private SexoEntity sexo;

	@Column(length = 11, nullable = false, unique = true)
	private String cpf;

	private String foto;


	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tab_pessoa_permissao",
	joinColumns = @JoinColumn(name = "pessoa_id"),
	inverseJoinColumns = @JoinColumn(name = "permissao_id") )
	private List<PermissaoEntity> permissoes;

	public PessoaEntity() {
		super();
	}

	public PessoaEntity(String nome, String sobrenome, Date datanasc, String telefone, String email, Date datacad,
			String password, LogradouroEntity logradouro, String numendereco, String compendereco, SexoEntity sexo,
			String cpf, String rg, String foto) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.datanasc = datanasc;
		this.telefone = telefone;
		this.email = email;
		this.datacad = datacad;
		this.password = password;
		this.logradouro = logradouro;
		this.numendereco = numendereco;
		this.compendereco = compendereco;
		this.sexo = sexo;
		this.cpf = cpf;
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
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

	public Date getDatacad() {
		return datacad;
	}

	public void setDatacad(Date datacad) {
		this.datacad = datacad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LogradouroEntity getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroEntity logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumendereco() {
		return numendereco;
	}

	public void setNumendereco(String numendereco) {
		this.numendereco = numendereco;
	}

	public String getCompendereco() {
		return compendereco;
	}

	public void setCompendereco(String compendereco) {
		this.compendereco = compendereco;
	}

	public SexoEntity getSexo() {
		return sexo;
	}

	public void setSexo(SexoEntity sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<PermissaoEntity> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<PermissaoEntity> permissoes) {
		this.permissoes = permissoes;
	}

}
