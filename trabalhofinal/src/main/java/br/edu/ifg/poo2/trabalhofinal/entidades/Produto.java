package br.edu.ifg.poo2.trabalhofinal.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
@SequenceGenerator(name = "produto_id_seq", sequenceName = "produto_id_seq", allocationSize = 1)//auto increment nessa culuna
public class Produto implements Serializable {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
	private long id;
	@Column(name="NOME", length=100)
	private String nome;
	@Column(name="CODIGO", length=16)
	private String codigo;
	@Column(name="DESCRICAO", length=100)
	private String descricao;
	@Column(name="QUANTIDADE")
	private float quantidade;
	@Column(name="UNIDADE_MEDIDA", length=25)
	private String unidadeMedida;
	
	@ManyToMany(mappedBy = "produtos")
	private List<Venda> listaVenda;
	
	public Produto() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
	
}
