/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exe1 {

    public static void main(String[] args) {
        int numero;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 0 a 10"));

            for (int i = 0; i < 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe um número ");
        }

    }

}
