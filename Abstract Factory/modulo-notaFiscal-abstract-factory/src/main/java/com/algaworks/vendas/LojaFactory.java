package com.algaworks.vendas;

import java.io.IOException;
import java.util.Properties;

import com.algaworks.vendas.boleta.Boleta;
import com.algaworks.vendas.nfe.NFe;

public class LojaFactory implements ModuloVendaFactory{

	// retorna NFe ou Boleta a partir do arquivo de propriedades
	Properties prop = new Properties();
	NFe nfe;
	Boleta boleto;

	public NFe criarNotaFiscal() throws IOException {
		prop.load(this.getClass().getResourceAsStream("/config.properties"));
		String classeNFe = this.prop.getProperty("nfe");
		
		try {
			nfe = (NFe) Class.forName(this.prop.getProperty("nfe")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nfe;
	}

	public Boleta criarBoleta() throws IOException {
		prop.load(this.getClass().getResourceAsStream("/config.properties"));
		String classeNFe = this.prop.getProperty("boleta");
		
		try {
			boleto = (Boleta) Class.forName(this.prop.getProperty("boleta")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return boleto;
	}
}
