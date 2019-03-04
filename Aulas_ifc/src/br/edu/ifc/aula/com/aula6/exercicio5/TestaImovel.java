/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio5;

/**
 *
 * @author Gabriel
 */
public class TestaImovel {

    public static void main(String[] args) {

        Imovel a1 = new Novo(100000, "Rua alvorada, pindorama do oeste");
        
        a1.adicional(25000);
        
        Imovel a2 = new Velho(100000, " rua serrinha, pindorama do oste");
        
        a2.adicional(18000);
    }

}
