/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.UsuarioModelo;

/**
 *
 * @author edevaldo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       UsuarioModelo us = new UsuarioModelo();
        
        us.setLogin("SARA");
        us.setSenha("lindaoLindao");
        us.setNivelPermissao(8);
        
        UsuarioControle add = new UsuarioControle();
        //add.inserir(us);
        
        //add.excluir("6");
        add.editar(us);
        
    }
    
}
