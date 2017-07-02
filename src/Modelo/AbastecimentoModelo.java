package Modelo;


import java.sql.Date;


public class AbastecimentoModelo {
    
    int codAbastecimento, kmDeAbastecimento, kmDeAbastecimentoAnterior, codVeiculo;
    Date dataAbastecimento;
    float qtdAbastecida;
    VeiculoModelo veiculo;
    
    public AbastecimentoModelo(int codAbastecimento, int kmDeAbastecimento, int codVeiculo,
    		Date dataAbastecimento, float qtdAbastecida)
    {
    	this.codAbastecimento = codAbastecimento;
    	this.kmDeAbastecimento = kmDeAbastecimento;
    	this.codVeiculo = codVeiculo;
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
	//Editado nao precisa cadastrar objeto de veiculo, somente o codigo do tipo int
	public int getCodVeiculo() {
		return veiculo.codVeiculo;
	}
	public void setCodVeiculo(VeiculoModelo veiculo) {
		this.codVeiculo = veiculo.codVeiculo;
	}

}
