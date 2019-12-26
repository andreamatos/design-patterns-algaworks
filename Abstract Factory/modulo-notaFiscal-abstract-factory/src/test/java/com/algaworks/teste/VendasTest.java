package com.algaworks.teste;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.vendas.LojaFactory;
import com.algaworks.vendas.ModuloVendaFactory;
import com.algaworks.vendas.cliente.Venda;

public class VendasTest {

	private Venda venda;
	
	@Before
	public void init() throws IOException {
		ModuloVendaFactory moduloPagamentoFactory = new LojaFactory();
		venda = new Venda(moduloPagamentoFactory);
	}
	
	@Test
	public void deveAutorizarVenda() {
		Long codigoAutorizacao = venda.realizarVenda(2.00);
		assertNotNull(codigoAutorizacao);
	}
	
}
