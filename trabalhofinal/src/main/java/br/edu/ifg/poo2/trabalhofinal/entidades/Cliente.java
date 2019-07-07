package br.edu.ifg.poo2.trabalhofinal.entidades;

import java.io.Serializable;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="CLIENTE")
@SequenceGenerator(name = "clientes_id_seq", sequenceName = "cliente_id_seq", allocationSize = 1)//auto increment nessa culuna
public class Cliente implements Serializable{
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
	private long id;
	@Column(name="NOME", length=100)
	private String nome;	
	@Column(name="CPF", length=11)
	private String cpf;
	@Column(name="RG", length=50)
	private String rg;
	@Column(name="SEXO", length=1)
	private String sexo;
	
	@OneToMany(mappedBy="cliente")  
	private List<Venda> vendas;
	
	
	private static final long serialVersionUID = 1L;
	
	public Cliente() {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
	
	
	
}
