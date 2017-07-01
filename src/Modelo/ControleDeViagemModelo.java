package Modelo;

import java.sql.Date;

public class ControleDeViagemModelo {
	
	int kmEntrada, kmSaida, codControle, codMotorista, codVeiculo;//adicionado codMotorista e codVeiculo em 28/06/2017
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
	//Editado não precisa cadastrar objeto de veiculo e motorista, somente os codigos do tipo int
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
	