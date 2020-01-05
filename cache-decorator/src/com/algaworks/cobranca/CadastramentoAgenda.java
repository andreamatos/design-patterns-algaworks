package com.algaworks.cobranca;

import com.algaworks.cobranca.service.AnalisadorDeRiscoClearSale;
import com.algaworks.cobranca.service.AutorizadorCartaoCredito;
import com.algaworks.cobranca.service.AutorizadorCielo;

public class CadastramentoAgenda {

	public static void main(String[] args) {
		
//		instanciar CacheAgendaDao com o tipo AgendaDAO informando no parametro o tipo da agenda, neste caso de exemplo
//		seria AgendaCliente
		
		
		AutorizadorCartaoCredito autorizador = new AnalisadorDeRiscoClearSale(new AutorizadorCielo());
		autorizador.autorizar(cliente, cartaoCredito, valor);
	}

}
