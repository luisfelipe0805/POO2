package br.edu.ifg.poo2.trabalhofinal.entidades;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
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
