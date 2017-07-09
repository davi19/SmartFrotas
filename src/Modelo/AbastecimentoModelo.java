package Modelo;


import java.sql.Date;


public class AbastecimentoModelo {
    
	private int codAbastecimento, kmDeAbastecimento, kmDeAbastecimentoAnterior;
        String placaVeiculo;
	private Date dataAbastecimento;
	private float qtdAbastecida;
    
    public AbastecimentoModelo(int codAbastecimento, int kmDeAbastecimento, 
            int kmDeAbastecimentoAnterior, String placaVeiculo,
    		Date dataAbastecimento, float qtdAbastecida)
    {
    	this.codAbastecimento = codAbastecimento;
    	this.kmDeAbastecimento = kmDeAbastecimento;
        this.kmDeAbastecimentoAnterior = kmDeAbastecimentoAnterior;
    	this.placaVeiculo = placaVeiculo;
    	this.dataAbastecimento = dataAbastecimento;
    	this.qtdAbastecida = qtdAbastecida;
    }
    
	public int getCodAbastecimento() {
		return codAbastecimento;
	}
	public void setCodAbastecimento(int codAbastecimento) {
		this.codAbastecimento = codAbastecimento;
	}
	public int getKmDeAbastecimento() {
		return kmDeAbastecimento;
	}
	public void setKmDeAbastecimento(int kmDeAbastecimento) {
		this.kmDeAbastecimento = kmDeAbastecimento;
	}
	public Date getDataAbastecimento() {
		return dataAbastecimento;
	}
	public int getKmDeAbastecimentoAnterior() {
		return kmDeAbastecimentoAnterior;
	}
	public void setKmDeAbastecimentoAnterior(int kmDeAbastecimentoAnterior) {
		this.kmDeAbastecimentoAnterior = kmDeAbastecimentoAnterior;
	}
	public void setDataAbastecimento(Date dataAbastecimento) {
		this.dataAbastecimento = dataAbastecimento;
	}
	public float getQtdAbastecida() {
		return qtdAbastecida;
	}
	public void setQtdAbastecida(float qtdAbastecida) {
		this.qtdAbastecida = qtdAbastecida;
	}
	public String getplacaVeiculo() {
		return placaVeiculo;
	}
	public void setplacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

}
