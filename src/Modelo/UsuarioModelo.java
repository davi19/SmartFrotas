package Modelo;

public class UsuarioModelo {
    
    String senha, login;
    int nivelPermissao;
    
    
	public UsuarioModelo(String senha, String login, int nivelPermissao) 
	{
		this.senha = senha;
		this.login = login;
		this.nivelPermissao = nivelPermissao;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getNivelPermissao() {
		return nivelPermissao;
	}
	public void setNivelPermissao(int nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}

  
    
}
