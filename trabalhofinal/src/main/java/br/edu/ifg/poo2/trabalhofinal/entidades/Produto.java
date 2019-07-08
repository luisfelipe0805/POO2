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
	
	@ManyToMany(mappedBy = "vendaProdutos")
	private List<Venda> listaVenda;
	
	@ManyToMany(mappedBy="compraProdutos")
	private List<Compra> listaCompra;
	
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	
}
