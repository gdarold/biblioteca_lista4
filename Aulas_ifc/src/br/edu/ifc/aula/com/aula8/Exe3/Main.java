/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        
        int []idade= new int[4];
        
        for (int i = 0; i < idade.length; i++) {
            int passe;
            passe = Integer.parseInt(JOptionPane.showInputDialog("Digite a "+(i+1)+" ª idade"));
            idade[i]= passe;
        }
        
        Idades id = new Idades(idade);
        
        id.calculaMaiorMenor();
    }
}
