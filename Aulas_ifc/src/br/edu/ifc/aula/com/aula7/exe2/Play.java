/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.exe2;

/**
 *
 * @author aluno
 */
public class Play implements Jogo {

    @Override
    public void andar() {
        System.out.println("Esta andando");
    }

    @Override
    public void pular() {
        System.out.println("Esta pulando");
    }

    @Override
    public void chutar() {
        System.out.println("Esta chutando");
    }

}
