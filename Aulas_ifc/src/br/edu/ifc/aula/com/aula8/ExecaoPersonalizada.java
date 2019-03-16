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
class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String getMessage() {
        return "ERRO: " + super.getMessage();
    }

}

public class ExecaoPersonalizada {

    public static void autenticar(String senha) throws SenhaInvalidaException {
        if ("123".equals(senha)) {
            System.out.println("Antenticado");
        } else {
            throw new SenhaInvalidaException("Senha incorreta!");
        }
    }

    public static void main(String[] args) {
        try {
            autenticar("123456");
        } catch (SenhaInvalidaException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
