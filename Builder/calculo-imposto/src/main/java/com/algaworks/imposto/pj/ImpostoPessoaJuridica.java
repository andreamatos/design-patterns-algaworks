package com.algaworks.imposto.pj;

import com.algaworks.imposto.Imposto;
import com.algaworks.interfaces.Cobranca;

public class ImpostoPessoaJuridica extends Imposto{
	@Override
	protected Cobranca imposto() {
		return new PessoaJuridica();
	}
}
