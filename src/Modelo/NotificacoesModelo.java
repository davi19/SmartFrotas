package Modelo;

import java.sql.Date;

public class NotificacoesModelo {

	public boolean VencimentoDeCNH(MotoristaModelo motorista){
												
		Date dataHoje = new java.sql.Date(new java.util.Date().getTime());
		
		if(dataHoje.after(motorista.getDataDeEmissaoCNH()))
			return true;//vencida
		else if(dataHoje.equals(motorista.getDataDeEmissaoCNH()))
			return true; // vencida
		else
			return false;//liberada
	}
}
