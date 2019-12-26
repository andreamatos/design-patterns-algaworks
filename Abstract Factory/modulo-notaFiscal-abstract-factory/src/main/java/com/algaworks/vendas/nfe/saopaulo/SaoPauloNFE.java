package com.algaworks.vendas.nfe.saopaulo;

import com.algaworks.vendas.nfe.NFe;

public class SaoPauloNFE implements NFe{

	@Override
	public Long gerarNotaFiscal(Double valor) {
		System.out.println("Gerando Nota Fiscal Sao Paulo");
		return null;
	}
}
