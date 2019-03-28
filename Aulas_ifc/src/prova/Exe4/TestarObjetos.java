/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.Exe4;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class TestarObjetos {

    public static void main(String[] args) {

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma forma geométrica", null,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"Círculo", "Retângulo"}, 0
        );

        System.out.println(escolha);

        try {
            switch (escolha) {

                case 0:

                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o ráio do círculo"));
                    Circulo cir = new Circulo(valor);

                    JOptionPane.showMessageDialog(null, "Área do círculo " + cir.calcularArea() + "\nPerímetro do círculo " + cir.calcularPerimetro());

                    break;
                case 1:

                    int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do retângulo"));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retângulo"));
                    Retangulo retangulo = new Retangulo(base, altura);

                    JOptionPane.showMessageDialog(null, "Área do retângulo " + retangulo.calcularArea()
                            + "\nPerímetro do retângulo " + retangulo.calcularPerimetro());

                    break;

                default:
                JOptionPane.showMessageDialog(null, "Escolha invalida ");

            }
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe um número ");
        }

    }

}
