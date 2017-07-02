package Modelo;

import java.sql.Date;

public class ControleDeViagemModelo {
	
	int kmEntrada, kmSaida, codControle, codMotorista, codVeiculo;
	MotoristaModelo motorista;
	VeiculoModelo veiculo;
	Date dataEntrada, dataSaida;
	

	public ControleDeViagemModelo(int kmEntrada, int kmSaida, int codControle,
			int codMotorista, int codVeiculo, Date dataEntrada, Date dataSaida) 
	{
		this.kmEntrada = kmEntrada;
		this.kmSaida = kmSaida;
		this.codControle = codControle;
		this.codMotorista = codMotorista;
		this.codVeiculo = codVeiculo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

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
	public int getCodVeiculo() {
		return veiculo.codVeiculo;
	}
	public void setCodVeiculo(VeiculoModelo veiculo) {
		this.codVeiculo = veiculo.codVeiculo;
	}
	public int getCodMotorista() {
		return motorista.codMotorista;
	}
	public void setCodMotorista(MotoristaModelo motorista) {
		this.codMotorista = motorista.codMotorista;
	}
	
	
	
}
	