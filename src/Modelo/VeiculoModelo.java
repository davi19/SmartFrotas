package Modelo;


public class VeiculoModelo {
    
	private  String placaVeiculo, tipoVeiculo, fabricante, modelo, cor;
	private int anoFabricacao, numeroChassi, capacidadeTanque;
	private float mediaConsumo;
    
    
    public VeiculoModelo(String placaVeiculo, String tipoVeiculo,
			String fabricante, String modelo, String cor,
			int anoFabricacao, int numeroChassi, int capacidadeTanque,
			float mediaConsumo) 
    {
		this.placaVeiculo = placaVeiculo;
		this.tipoVeiculo = tipoVeiculo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.numeroChassi = numeroChassi;
		this.capacidadeTanque = capacidadeTanque;
		this.mediaConsumo = mediaConsumo;
	}

	public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(int numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public float getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(float mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    } 

    
}


