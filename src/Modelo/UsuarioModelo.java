package Modelo;

public class UsuarioModelo {

    private String senha, login, nivelPermissao;
    private int codUsuario;

    public UsuarioModelo(int codUsuario, String senha, String login, String nivelPermissao) {
        this.codUsuario = codUsuario;
        this.senha = senha;
        this.login = login;
        this.nivelPermissao = nivelPermissao;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
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

    public String getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(String nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

}
