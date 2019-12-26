package com.algaworks.vendas;

import java.io.IOException;

import com.algaworks.vendas.boleta.Boleta;
import com.algaworks.vendas.nfe.NFe;

public interface ModuloVendaFactory {
	public NFe criarNotaFiscal() throws IOException;
	public Boleta criarBoleta() throws IOException;
}
