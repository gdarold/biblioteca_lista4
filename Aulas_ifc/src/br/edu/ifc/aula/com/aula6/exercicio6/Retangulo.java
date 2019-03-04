/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio6;

/**
 *
 * @author Gabriel
 */
public class Retangulo extends Forma {

    @Override
    protected double getArea(double tamanho) {

        return (tamanho * tamanho);
    }

    @Override
    protected double getPerimetro(double tamanho) {

        return (tamanho * 4);
    }

}
