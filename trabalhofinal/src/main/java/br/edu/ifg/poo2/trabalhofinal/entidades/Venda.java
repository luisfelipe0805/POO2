package br.edu.ifg.poo2.trabalhofinal.entidades;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VENDA")
@SequenceGenerator(name = "venda_id_seq", sequenceName = "venda_id_seq", allocationSize = 1)//auto increment nessa culuna
public class Venda {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venda_id_seq")
	private long id;
	
//	@ManyToOne
//	@Column(name ="CLIENTE")
//	private Cliente cliente;
	
//	@ManyToMany
//    @JoinTable(name = "venda_cliente",
//        joinColumns = @JoinColumn(name = "venda_id"),
//        inverseJoinColumns = @JoinColumn(name = "cliente_id"))
//	@Column(name ="cliente" )
//	private List<Cliente> cliente;
	
	
	
	
	@ManyToMany
    @JoinTable(name = "venda_produto",
        joinColumns = @JoinColumn(name = "venda_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id"))
	@Column(name ="ID_PRODUTO" )
	private List<Produto> produtos;
	
	
	@Column(name ="CODIGO_VENDA")
	private long codigoVenda;
	@Column(name="PRECO")
	private float preco;
	
	private static final long serialVersionUID = 1L;
		
	
	public Venda(Cliente cliente, Produto produto) {
//		this.cliente.add(cliente);
		this.produtos.add(produto);
	}	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	public long getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(long codigoVenada) {
		this.codigoVenda = codigoVenada;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
//	public List<Cliente> getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(List<Cliente> cliente) {
//		this.cliente = cliente;
//	}


	
	
	
	
}
