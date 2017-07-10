package Modelo;

import java.sql.Date;

public class ControleDeViagemModelo implements IKmPercorridoModelo {

    private int kmEntrada, kmSaida, codControle;
    private MotoristaModelo motorista;
    private VeiculoModelo veiculo;
    private Date dataEntrada, dataSaida;
    private String placaVeiculo, nomeMotorista;

 
	public ControleDeViagemModelo(int kmEntrada, int kmSaida,
            String nomeMotorista, Date dataEntrada, Date dataSaida, String placaVeiculo) {
        
        this.kmEntrada = kmEntrada;
        this.kmSaida = kmSaida;
        this.nomeMotorista = nomeMotorista;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.placaVeiculo = placaVeiculo;
    }
        
        public ControleDeViagemModelo(int codControle, int kmEntrada, int kmSaida,
            String nomeMotorista, Date dataEntrada, Date dataSaida, String placaVeiculo) {
        
        this.codControle = codControle;
        this.kmEntrada = kmEntrada;
        this.kmSaida = kmSaida;
        this.nomeMotorista = nomeMotorista;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.placaVeiculo = placaVeiculo;
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

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public int KmPercorrido() {
        return kmEntrada - kmSaida;
    }

}
