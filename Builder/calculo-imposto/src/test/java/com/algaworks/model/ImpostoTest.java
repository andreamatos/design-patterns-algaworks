package com.algaworks.model;

import org.junit.Test;

import com.algaworks.model.builder.CalculoImpostoBuilder;

public class ImpostoTest {
	
	@Test
	public void deveCalcularValorTotalPedidoParaClienteVipComBuilder() {
		NotaFiscal impostos = new CalculoImpostoBuilder()
										.produto()
										.data()
										.nota(1)
										.construir();
		
//		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.0001);
	}
	
}












