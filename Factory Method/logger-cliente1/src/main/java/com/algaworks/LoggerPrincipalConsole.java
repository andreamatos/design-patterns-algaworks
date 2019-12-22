package com.algaworks;

import javax.swing.JOptionPane;

import com.algaworks.geradorlogs.GeraLog;
import com.algaworks.logger.console.ImprimeConsole;

public class LoggerPrincipalConsole {
	public static void main(String[] args) {
	    String mensagem = JOptionPane.showInputDialog(null, "Teste do Log");
	    GeraLog gerarLog = new ImprimeConsole(mensagem);
	    boolean status = gerarLog.gerarLog(mensagem);
    }
}