package com.algaworks;

import javax.swing.JOptionPane;

import com.algaworks.bean.CadastraFilmeService;
import com.algaworks.model.Filme;
import com.algaworks.util.cdi.WeldContext;

public class Principal {

	public static void main(String[] args) {
		CadastraFilmeService service = WeldContext.INSTANCE.getBean(CadastraFilmeService.class);
		
	    String nomeFilme = JOptionPane.showInputDialog(null, "Nome do Filme:");		
	    String data = JOptionPane.showInputDialog(null, "Data:");
	    
	    Filme filme = new Filme(nomeFilme, data);
		
		service.salvar(filme);
    }
	
}
