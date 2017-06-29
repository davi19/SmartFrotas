package Modelo;

import java.sql.Date;

public class ControleDeViagemModelo {
	
	int kmEntrada, kmSaida, codControle;
	MotoristaModelo motorista;
	VeiculoModelo veiculo;
	//String satus; Removido em 27/06/2017
	Date dataEntrada, dataSaida;
	
	
	public int getKmEntrada() {
		return kmEntrada;
	}
	public void setKmEntrada(int kmEntrada) {
		this.kmEntrada = kmEntrada;
	}
	public int getKmSaida() {
		return kmSaida;
	}
	public void setKmSaida(int kmSaida) {
		this.kmSaida = kmSaida;
	}
	public int getCodControle() {
		return codControle;
	}
	public void setCodControle(int codControle) {
		this.codControle = codControle;
	}
	public MotoristaModelo getMotorista() {
		return motorista;
	}
	public void setMotorista(MotoristaModelo motorista) {
		this.motorista = motorista;
	}
	public VeiculoModelo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(VeiculoModelo veiculo) {
		this.veiculo = veiculo;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public int KmPercorrido(){
		return kmEntrada - kmSaida;
	}
	
	public String ConverteData(String dataCalendar)
	{
		String aux[] = dataCalendar.split("/");
		dataCalendar = aux[2] + "-" + aux[1] + "-" + aux[0];
		return dataCalendar;
	}
	
	
}
	