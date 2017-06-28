package Modelo;


import java.sql.Date;

public class MotoristaModelo {
    
	int codMotorista;//adicionado em 27/06/2017
    String numeroCNH, categoriaCNH, nome;
    Date dataDeEmissaoCNH;
    
    

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public int getCodMotorista() {
		return codMotorista;
	}

	public void setCodMotorista(int codMotorista) {
		this.codMotorista = codMotorista;
	}

	public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public Date getDataDeEmissaoCNH() {
		return dataDeEmissaoCNH;
	}

	public void setDataDeEmissaoCNH(Date dataDeEmissaoCNH) {
		this.dataDeEmissaoCNH = dataDeEmissaoCNH;
	}


   

}