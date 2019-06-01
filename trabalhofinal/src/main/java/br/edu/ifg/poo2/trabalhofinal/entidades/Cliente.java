package br.edu.ifg.poo2.trabalhofinal.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


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
	@Column(name="CODIGO", length=50)
	private String codigo;
	
	private static final long serialVersionUID = 1L;
	
	public Cliente() {
		super();
	}	
	
	public Cliente(Integer id, String nome, String cpf, String codigo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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
