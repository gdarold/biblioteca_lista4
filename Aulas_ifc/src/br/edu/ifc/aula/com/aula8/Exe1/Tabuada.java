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
public class Tabuada {

    private int numero;

    public Tabuada(int numero) {
        this.numero = numero;
    }

    public void tabuada() {

        try {
            

            for (int i = 1; i <= 10; i++) {
                System.out.println(this.numero + " x " + i + " = " + this.numero * i);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe um número ");
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
