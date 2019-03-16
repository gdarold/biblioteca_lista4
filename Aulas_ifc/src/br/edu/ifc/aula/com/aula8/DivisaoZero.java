/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class DivisaoZero {

    public static void main(String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog("Informe um número inteiro: ");

            Integer n1 = Integer.parseInt(entrada);
            Integer n2 = 0;

// divisão por zero
            System.out.println(n1 / n2);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } finally {

        }
    }
}

