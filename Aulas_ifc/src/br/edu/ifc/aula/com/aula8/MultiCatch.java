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
public class MultiCatch {

    public static void main(String[] args) {
        String entrada;
        boolean continuar = true;
        Integer dividendo = null, divisor = null, quociente, resto;
        do {
            try {
                if (dividendo == null) {
                    entrada = JOptionPane.showInputDialog("Informe o dividendo: ");
                    dividendo = Integer.parseInt(entrada);
                }

                if (divisor == null) {
                    entrada = JOptionPane.showInputDialog("Informe o divisor: ");
                    divisor = Integer.parseInt(entrada);
                }

                quociente = dividendo / divisor;
                resto = dividendo % divisor;

                System.out.println("O quociente entre " + dividendo + " e " + divisor + " é: " + quociente);
                System.out.println("O resto da divisão entre " + dividendo + " e " + divisor + " é: " + resto);

// se chegar aqui é porque não deu erro
                continuar = false;
            } catch (NumberFormatException | ArithmeticException ex) {
                ex.printStackTrace();
                if (ex instanceof NumberFormatException) {

                    JOptionPane.showMessageDialog(null, "Informe um número válido!");
                } else if (ex instanceof ArithmeticException) {

                    JOptionPane.showMessageDialog(null, "Não foi possível efetuar o cálculo. Teste novamente!");

                }
            } finally {
                System.out.println("Sempre passa por aqui.");
            }
        } while (continuar);
    }

}
