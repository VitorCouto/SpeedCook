//package speedCook.cardapio;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import speedCook.empresa.EmpresaEntity;
//import speedCook.utils.BaseEntity;
//
//@Entity
//@Table(name = "tab_cardapio")
//@AttributeOverride(name = "id", column = @Column(name = "idcardapio") )
//public class CardapioEntity extends BaseEntity<Long> {
//
//	private static final long serialVersionUID = 201602010251L;
//
//	//@ManyToOne
//	//@JoinColumn(name = "codproduto", nullable = false)
//	//private ProdutoEntity produto;
//
//	@ManyToOne
//	@JoinColumn(name = "codempresa", nullable = false)
//	private EmpresaEntity empresa;
//
//	@Column(nullable = false)
//	private Double valor;
//
//	@Column(nullable = false)
//	private Integer quantidade;
//
//	public CardapioEntity() {
//		super();
//	}
//
//	public CardapioEntity(EmpresaEntity empresa, Double valor, Integer quantidade) {
//		super();
//		this.empresa = empresa;
//		this.valor = valor;
//		this.quantidade = quantidade;
//	}
//
//	public EmpresaEntity getEmpresa() {
//		return empresa;
//	}
//
//	public void setEmpresa(EmpresaEntity empresa) {
//		this.empresa = empresa;
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
//	public Integer getQuantidade() {
//		return quantidade;
//	}
//
//	public void setQuantidade(Integer quantidade) {
//		this.quantidade = quantidade;
//	}
//
//}
