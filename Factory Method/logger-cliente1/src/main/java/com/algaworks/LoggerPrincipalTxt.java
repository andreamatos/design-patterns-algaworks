package com.algaworks;

import javax.swing.JOptionPane;

import com.algaworks.geradorlogs.GeraLog;
import com.algaworks.logger.txt.ImprimeTxt;

public class LoggerPrincipalTxt {
	public static void main(String[] args) {
	    String mensagem = JOptionPane.showInputDialog(null, "Teste do Log");
	    GeraLog gerarLog = new ImprimeTxt(mensagem);
	    boolean status = gerarLog.gerarLog(mensagem);
    }
}