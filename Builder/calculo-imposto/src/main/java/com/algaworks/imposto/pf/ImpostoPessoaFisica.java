package com.algaworks.imposto.pf;

import com.algaworks.imposto.Imposto;
import com.algaworks.interfaces.Cobranca;

public class ImpostoPessoaFisica extends Imposto{
	@Override
	protected Cobranca imposto() {
		return new PessoaFisica();
	}
}
