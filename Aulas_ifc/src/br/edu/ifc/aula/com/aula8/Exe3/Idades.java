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
public class Idades {

    int idade[];

    public Idades(int idade[]) {
        this.idade = idade;
    }

    public void calculaMaiorMenor() {

        try {
            int menor = 100, maior = 0;
            for (int i : idade) {
                if (i >= 0 && i < 100) {

                    if (i > maior) {
                        maior = i;
                    }
                    if (i < menor) {
                        menor = i;

                    }
                } else {

                    throw new RuntimeException(" numdero deve ficar entre 0 e 99");
                }

            }
            JOptionPane.showMessageDialog(null, "A menor idade é: "+menor+" a maior idade é: "+maior);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            ex.getMessage();

        }

    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

}
