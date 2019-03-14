/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.exe5;

/**
 *
 * @author aluno
 */
public class FabricaLampada {

    public Lampada construir(int tipoLampada) {

        if (tipoLampada == 1) {
            return new Incandescente();
        } else {

            return new Fluorescente();

        }

    }

}

class Incandescente implements Lampada {

    @Override
    public void ligar() {
        System.out.println("Lampada incandescente ligada");

    }

    @Override
    public void desligar() {
        System.out.println("Lampada desligada");

    }

}

class Fluorescente implements Lampada {

    @Override
    public void ligar() {
        System.out.println("Lampada fluorescente ligada");
    }

    @Override
    public void desligar() {

        System.out.println("Lampada desligada");

    }

}
