package com.algaworks.vendas.boleta.bradesco;

import com.algaworks.vendas.boleta.Boleta;

public class BoletoBradesco implements Boleta{

	@Override
	public void emitir(Double valor) {
		System.out.println("Gerando Boleto Banco Bradesco");
	}

}
