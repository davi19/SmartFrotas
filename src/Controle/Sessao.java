/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
/**
 *
 * @author edevaldo
 */
public class Sessao{
   private static Sessao instance = null;
   private String nivelPermissao;
   private Sessao(){
   }
   public void setnivelPermissao(String nivelPermissao){
      this.nivelPermissao = nivelPermissao;
   }
   public String getnivelPermissao(){
       return nivelPermissao;
   }
   public static Sessao getInstance(){
         if(instance == null){
               instance = new Sessao();
         }
        return instance;
   }
}