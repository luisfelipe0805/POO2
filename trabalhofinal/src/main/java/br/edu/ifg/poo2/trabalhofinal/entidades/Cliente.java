package br.edu.ifg.poo2.trabalhofinal.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	@Id
	private int id;
	@Column(name="NOME", length=100)
	private String nome;
	@Column(name="CPF", length=11)
	private String cpf;
	@Column(name="CODIGO", length=50)
	private String codigo;
	
	public Cliente() {
		super();
	}	
	
	public Cliente(int id, String nome, String cpf, String codigo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.codigo = codigo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
