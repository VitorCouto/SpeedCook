package speedCook.pedido;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import speedCook.empresa.EmpresaEntity;
import speedCook.pessoa.PessoaEntity;
import speedCook.status.StatusEntity;
import speedCook.utils.BaseEntity;

@Entity
@Table(name = "tab_pedido")
@AttributeOverride(name = "id", column = @Column(name = "idpedido") )
public class PedidoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;

	@Column(nullable = true)
	private Date datapedido;

	private Double desconto;

	@Column(nullable = false)
	private Double totalpedido;

	@ManyToOne
	@JoinColumn(name = "codpessoa")
	private PessoaEntity pessoa;

	@ManyToOne
	@JoinColumn(name = "codstatus")
	private StatusEntity status;

	@ManyToOne
	@JoinColumn(name = "codempresa")
	private EmpresaEntity empresa;

	public PedidoEntity() {
		super();
	}

	public PedidoEntity(Date datapedido, Double desconto, Double totalcomdesconto, PessoaEntity pessoa,
			StatusEntity status, EmpresaEntity empresa) {
		super();
		this.datapedido = datapedido;
		this.desconto = desconto;
		this.totalpedido = totalcomdesconto;
		this.pessoa = pessoa;
		this.status = status;
		this.empresa = empresa;
	}

	public Date getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(Date datapedido) {
		this.datapedido = datapedido;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotalpedido() {
		return totalpedido;
	}

	public void setTotalpedido(Double totalpedido) {
		this.totalpedido = totalpedido;
	}

	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	public StatusEntity getStatus() {
		return status;
	}

	public void setStatus(StatusEntity status) {
		this.status = status;
	}

	public EmpresaEntity getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaEntity empresa) {
		this.empresa = empresa;
	}

}
