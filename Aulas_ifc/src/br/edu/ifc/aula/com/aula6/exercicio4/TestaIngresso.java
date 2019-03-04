/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio4;

/**
 *
 * @author Gabriel
 */
public class TestaIngresso {
    
    public static void main(String[] args) {
        
        Ingresso v1 = new Vip(100);
        v1.imprimeValor();
        
        Vip v2 = new Vip(100);
        v2.valorAdicional(50);
        
        
        CamaroteInferior v3 = new CamaroteInferior("setor 4", 100);
      
        v3.imprimeLocal();
       
        CamaroteSuperior v4 = new CamaroteSuperior(150);
        v4.valorAdicional(80);;
        
        Ingresso v5 = new Normal(50);
        v5.imprimeValor();
    }
}
