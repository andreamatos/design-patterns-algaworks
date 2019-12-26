package com.algaworks.vendas.cliente;

import java.io.IOException;
import java.math.BigDecimal;

import com.algaworks.vendas.ModuloVendaFactory;
import com.algaworks.vendas.boleta.Boleta;
import com.algaworks.vendas.nfe.NFe;

public class Venda {
	private NFe notaFiscal;
	private Boleta boleta;
	
	public Venda(ModuloVendaFactory vendasFactory) throws IOException {
		this.notaFiscal = vendasFactory.criarNotaFiscal();
		this.boleta = vendasFactory.criarBoleta();
	}

	public Long realizarVenda(Double valor){
		this.notaFiscal.gerarNotaFiscal(valor);
		this.boleta.emitir(valor);
		return null;
		/* return confirmar venda na classe estado this.operadora.confirmar(); */
    }
}
