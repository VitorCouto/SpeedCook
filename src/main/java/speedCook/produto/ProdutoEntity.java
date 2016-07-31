package speedCook.produto;

import java.sql.Blob;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_produto")
@AttributeOverride(name = "id", column = @Column(name = "idproduto") )
public class ProdutoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(name = "nomeproduto", length = 255, nullable = false, unique = true)
	private String nomeproduto;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable = false)
	private Double valor;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private Blob foto;

	@Column(name = "codempresa")
	private Long codEmpresa;

	public ProdutoEntity() {
		super();
	}

	public ProdutoEntity(String nomeproduto, Integer quantidade, Double valor, String descricao, Blob foto,
			Long codEmpresa) {
		super();
		this.nomeproduto = nomeproduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.descricao = descricao;
		this.foto = foto;
		this.codEmpresa = codEmpresa;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

}
