package com.algaworks.model.builder;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.algaworks.imposto.Imposto;
import com.algaworks.imposto.pf.ImpostoPessoaFisica;
import com.algaworks.model.NotaFiscal;
import com.algaworks.model.Produto;

public class CalculoImpostoBuilder {
	private NotaFiscal instancia;

	public CalculoImpostoBuilder() {
		this.instancia = new NotaFiscal();
	}

	public CalculoImpostoBuilder produto() {
		definirProduto();
		return this;
	}

	public CalculoImpostoBuilder data() {
		definirDataEmissao();
		return this;
	}

	public CalculoImpostoBuilder nota(Integer nota) {
		definirNota(nota);
		return this;
	}
	
	private void definirProduto() {
		Produto produto = new Produto();
		produto.setNome("Refrigerante");
		produto.setQuantidade(2);

		Imposto imposto = new ImpostoPessoaFisica();
	    Double valorCobrado = imposto.cobrarImposto(5.00) * produto.getQuantidade();
	    
		produto.setValor(new BigDecimal(valorCobrado));
		
		if (this.instancia.getItensProduto() == null) {
			this.instancia.setItensProduto(new ArrayList<Produto>());
		}
		
		this.instancia.getItensProduto().add(produto);
	}
	
	private void definirDataEmissao() {
		Date data = new Date();
		data.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		this.instancia.setDataEmissao(dateFormat.format(data));
	}
	
	private void definirNota(Integer nota) {
		this.instancia.setNumero(nota);
	}
	
	public NotaFiscal construir() {
		return this.instancia;
	}
}










