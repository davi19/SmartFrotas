/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.UsuarioModelo;
import Modelo.MotoristaModelo;
import Modelo.VeiculoModelo;
import Modelo.AbastecimentoModelo;

/**
 *
 * @author edevaldo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
       /* ADICIONA, EDITA E EXCLUI USUARIOS
        
        UsuarioModelo us = new UsuarioModelo();
        
        us.setLogin("Ana");
        us.setSenha("burricida");
        us.setNivelPermissao(0);
        
        UsuarioControle add = new UsuarioControle();
        add.inserir(us);
        
       
        //add.excluir("6");
        //add.editar(us);
        
       */
       
       /* ADICIONA, EDITA E EXCLUI VEICULOS
       
       VeiculoModelo us = new VeiculoModelo();
         
       us.setCodVeiculo(12345);
       us.setAnoFabricacao(1999);
       us.setCapacidadeTanque(80);
       us.setCor("Azul");
       us.setModelo("Gol G5");
       us.setNumeroChassi(1234567890);
       us.setFabricante("VOLKS");
       us.setPlacaVeiculo("NKK6426");
       us.setTipoVeiculo("PASSEIO");
       us.setMediaConsumo((float) 10.89);
       
       VeiculoControle add = new VeiculoControle();
       add.inserir(us);
       
       //add.excluir("6");
       //add.editar(us);
       
       */
       
       /* ADICIONA, EDITA E EXCLUI MOTORISTA
       
       MotoristaModelo us = new MotoristaModelo();
         
       us.setCategoriaCNH("B");
       us.setCodMotorista(2017);
       us.setNome("Edevaldo Ambrósio");
       us.setNumeroCNH("07313290667");
       us.setDataDeEmissaoCNH("29/06/2017");
       
       MotoristaControle add = new MotoristaControle();
       add.inserir(us);
       
       //add.excluir("6");
       //add.editar(us);
       
       */
       
       
       /* ADICIONA, EDITA E EXCLUI ABASTECIMENTO
       
       AbastecimentoModelo us = new AbastecimentoModelo();
         
       us.setCodAbastecimento(2000);
       us.setCodVeiculo(veiculo);
       us.setDataAbastecimento("02/10/1985");
       us.setKmDeAbastecimento(20);
       us.setKmDeAbastecimentoAnterior(12);
       us.setQtdAbastecida((float)37.6);
       
       AbastecimentoControle add = new AbastecimentoControle();
       add.inserir(us);
       
       //add.excluir("6");
       //add.editar(us);
    */
       
        /* ADICIONA, EDITA E EXCLUI ABASTECIMENTO
       
       AbastecimentoModelo us = new AbastecimentoModelo();
         
       us.setCodAbastecimento(2000);
       us.setCodVeiculo(veiculo);
       us.setDataAbastecimento("02/10/1985");
       us.setKmDeAbastecimento(20);
       us.setKmDeAbastecimentoAnterior(12);
       us.setQtdAbastecida((float)37.6);
       
       AbastecimentoControle add = new AbastecimentoControle();
       add.inserir(us);
       
       //add.excluir("6");
       //add.editar(us);
    */
       
    }
    
}
