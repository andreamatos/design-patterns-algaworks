package com.algaworks.model;

import java.util.List;

public class NotaFiscal {
	private Integer numero;
	private String dataEmissao;
	private List<Produto> itensProduto;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer nota) {
		this.numero = nota;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public List<Produto> getItensProduto() {
		return itensProduto;
	}
	public void setItensProduto(List<Produto> itensProduto) {
		this.itensProduto = itensProduto;
	}
}