/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.exe4;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();

        c1.depositar(250);
        c1.sacar(160);
        c1.saldo();

        ContaCorrente c2 = new ClienteEspecial();

        c2.depositar(250);
        c2.sacar(160);
        c2.saldo();
    }
}
