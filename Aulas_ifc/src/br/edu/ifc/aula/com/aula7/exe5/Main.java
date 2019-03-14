/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.exe5;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {
    
    
    public static void main(String[] args) {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a lampada 1 = inscandescente / 2 = flurescente"));
        
        Lampada lamp =  new FabricaLampada().construir(op);
        
        
       lamp.ligar();
       lamp.desligar();
       
       
       
    }
}
