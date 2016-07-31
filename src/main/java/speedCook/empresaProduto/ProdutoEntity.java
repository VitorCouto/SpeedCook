//package speedCook.empresaProduto;
//
//import java.sql.Blob;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//import speedCook.utils.BaseEntity;
//
//@Entity
//@Table(name = "tab_empresaproduto")
//public class ProdutoEntity extends BaseEntity<EmpresaProdutoKeyEntity> {
//
//	private static final long serialVersionUID = 201602010251L;
//
//	@Column(name = "nomeproduto", length = 255, nullable = false, unique = true)
//	private String nomeproduto;
//
//	private Integer quantidade;
//
//	private Double valor;
//
//	private String descricao;
//
//	private Blob foto;
//
//	public ProdutoEntity() {
//		super();
//	}
//
//	public ProdutoEntity(String nomeproduto, Integer quantidade, Double valor, String descricao, Blob foto) {
//		super();
//		this.nomeproduto = nomeproduto;
//		this.quantidade = quantidade;
//		this.valor = valor;
//		this.descricao = descricao;
//		this.foto = foto;
//	}
//
//	public String getNomeproduto() {
//		return nomeproduto;
//	}
//
//	public void setNomeproduto(String nomeproduto) {
//		this.nomeproduto = nomeproduto;
//	}
//
//	public Integer getQuantidade() {
//		return quantidade;
//	}
//
//	public void setQuantidade(Integer quantidade) {
//		this.quantidade = quantidade;
//	}
//
//	public Double getValor() {
//		return valor;
//	}
//
//	public void setValor(Double valor) {
//		this.valor = valor;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//
//	public Blob getFoto() {
//		return foto;
//	}
//
//	public void setFoto(Blob foto) {
//		this.foto = foto;
//	}
//
//}
