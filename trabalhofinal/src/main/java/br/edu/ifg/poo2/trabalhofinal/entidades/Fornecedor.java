package br.edu.ifg.poo2.trabalhofinal.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Fornecedor")
@SequenceGenerator(name = "forn_id_seq", sequenceName = "forn_id_seq", allocationSize = 1)//auto increment nessa culuna
public class Fornecedor implements Serializable{
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "forn_id_seq")
	private long id;
	@Column(name="NOME", length=100)
	private String nome;
	@Column(name="CNPJ", length=14)
	private String cnpj;
	@Column(name="CODIGO", length=50)
	private String codigo;
	
	@OneToMany(mappedBy = "fornecedor")
	private List<Compra> compras;
	
	private static final long serialVersionUID = 1L;
	
	public Fornecedor() {
		super();
	}	
	
	public Fornecedor(Integer id, String nome, String cpf, String codigo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cpf;
		this.codigo = codigo;
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
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
