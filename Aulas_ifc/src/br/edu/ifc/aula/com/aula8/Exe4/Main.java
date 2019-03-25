/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe4;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int tentativas = 0;
        CaixaEletronico jose = new CaixaEletronico();

        do {
            String senha1 = JOptionPane.showInputDialog("Digite a senha");
            try {
                jose.autenticaSenha(senha1);

            } catch (SenhaInvalidaException ex) {
                tentativas++;
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }

        } while (tentativas == 3);
        if (tentativas == 3) {
            throw new Exception("Cartão cancelado");
        }
    }

}
