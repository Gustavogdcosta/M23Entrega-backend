package br.com.gustavo.main;

import java.util.List;

public class Pessoa {

	private String nome;
	private String sexo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Pessoa(Pessoa pessoa) {
		
		this(pessoa.getNome(), pessoa.getSexo());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public List<Pessoa> Info(){
		Pessoa pessoa1 = new Pessoa("Joao", "masculino");
		Pessoa pessoa2 = new Pessoa("Carlos", "masculino");
		Pessoa pessoa3 = new Pessoa("Dani", "feminino");
		Pessoa pessoa4 = new Pessoa("Maria", "feminino");
		Pessoa pessoa5 = new Pessoa("Amanda", "feminino");
		
		
		return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5);
		
	}
}
