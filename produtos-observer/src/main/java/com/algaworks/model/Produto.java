package com.algaworks.model;


public class Produto {
	private String estabelecimento;
	private String nome;
	private Double preco;
	
	public Produto() {
	}

	public Produto(String estabelecimento, String nome, Double preco) {
		this.estabelecimento = estabelecimento;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}


}
