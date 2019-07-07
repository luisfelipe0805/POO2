package br.edu.ifg.poo2.trabalhofinal.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compra_id_seq")
	private long id ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fonecedor_id",referencedColumnName = "id", nullable=false)
	private Fornecedor fornecedor;
	
	@ManyToMany
	@JoinTable(name = "compra_produto",
     joinColumns = @JoinColumn(name = "compra_id"),
     inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private List<Produto> compraProdutos;
	
	@Column
	private long codigo_compra;
	
	@Column
	private float preco;
	
	
	private static final long serialVersionUID = 1L;
	
	public Compra() {
		
	}
	
	public Compra(Fornecedor fornecedor, Produto produto) {
		this.fornecedor=fornecedor;
		if  (compraProdutos==null) {
			compraProdutos= new ArrayList<Produto>();
		}
		this.compraProdutos.add(produto);
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Produto> getCompraProdutos() {
		return compraProdutos;
	}

	public void setCompraProdutos(List<Produto> compraProdutos) {
		this.compraProdutos = compraProdutos;
	}

	public long getCodigo_compra() {
		return codigo_compra;
	}
	public void setCodigo_compra(long codigo_compra) {
		this.codigo_compra = codigo_compra;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
}
