package com.algaworks.logger.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.algaworks.logs.Log;
import com.algaworks.logs.Logs;

public class LogsTxt implements Logs{
	private String mensagemLog;
	
	public LogsTxt(String mensagemLog) {
		this.mensagemLog = mensagemLog;
	}

	public Log criar() {
		Log logs = new Log();
		logs.setLog(mensagemLog);
		logs.setTipoLog("Arquivo TXT");
		
		
		try {
			FileWriter arq = new FileWriter("c:\\Users\\User\\log.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf(logs.getLog() + " " + logs.getTipoLog());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(logs.getLog() + " " + " " + logs.getTipoLog());
		return logs;
	}
}
