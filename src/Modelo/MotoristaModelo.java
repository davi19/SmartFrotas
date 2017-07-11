package Modelo;


import java.sql.Date;

public class MotoristaModelo {
    private int codMotorista;
    private String numeroCNH, categoriaCNH, nome;
    private Date dataDeVencimentoCNH;
    
    
    public MotoristaModelo(int codMotorista, String numeroCNH,
			String categoriaCNH, String nome, Date dataDeVencimentoCNH)
    {
		this.codMotorista = codMotorista;
		this.numeroCNH = numeroCNH;
		this.categoriaCNH = categoriaCNH;
		this.nome = nome;
		this.dataDeVencimentoCNH = dataDeVencimentoCNH;
	}

    public MotoristaModelo() {
    }
    

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

	public Date getDataDeVencimentoCNH() {
		return dataDeVencimentoCNH;
	}

	public void setDataDeVencimentoCNH(Date dataDeEmissaoCNH) {
		this.dataDeVencimentoCNH = dataDeEmissaoCNH;
	}


   

}