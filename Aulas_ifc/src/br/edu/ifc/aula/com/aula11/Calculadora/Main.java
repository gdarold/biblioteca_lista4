/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula11.Calculadora;



/**
 *
 * @author aluno
 */
public class Main {
    
     public static void main(String[] args) {

            Runnable rodar = new Runnable() {
                @Override
                public void run() {
                   Calculadora tela = new Calculadora();
                   tela.setVisible(true);
            }
       
            
        };
        
             java.awt.EventQueue.invokeLater(rodar);
        

    }

    
    
}
