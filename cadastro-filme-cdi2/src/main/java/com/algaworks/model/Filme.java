package com.algaworks.model;

import java.math.BigDecimal;
import java.util.Date;

public class Filme {

	private String nome;
	private String data;
	public String getData() {
		return data;
	}
	private String tipo;

	public Filme(String nome, String data) {
		this.nome = nome;
		this.data = data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
