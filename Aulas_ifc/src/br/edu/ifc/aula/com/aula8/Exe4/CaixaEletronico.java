/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe4;

/**
 *
 * @author Gabriel
 */
public class CaixaEletronico {

    public CaixaEletronico() {
    }

    public static void autenticaSenha(String senha) throws SenhaInvalidaException {

        if ("java".equals(senha)) {
            System.out.println("Seja bem vindo");

        } else {

            throw new SenhaInvalidaException("Senha invalida!");

        }

    }

}
