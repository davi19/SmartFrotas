package Modelo;

import java.sql.Date;

public class NotificacoesModelo {

	Date dataHoje = new java.sql.Date(new java.util.Date().getTime());
	
	public boolean VencimentoDeCNH(MotoristaModelo motorista){
												
		if(dataHoje.after(motorista.getDataDeVencimentoCNH()))
			return true;//vencida
		else if(dataHoje.equals(motorista.getDataDeVencimentoCNH()))
			return true; // vencida
		else
			return false;//liberada
	}
	
	public boolean PreVencimentoDeCNH(MotoristaModelo motorista) {
		
		dataHoje.setMonth(dataHoje.getMonth()+1);
		
		if(dataHoje.after(motorista.getDataDeVencimentoCNH()))
			return true;//vencida
		else if(dataHoje.equals(motorista.getDataDeVencimentoCNH()))
			return true; // vencida
		else
			return false;//liberada
	}
}
