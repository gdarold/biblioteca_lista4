/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.exe3;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {

        FormasGeometricas quadrado = new Quadrado(10);
        FormasGeometricas triangulo = new Triangulo(10, 6);
        FormasGeometricas retangulo = new Retangulo(8, 7);

        System.out.println("área do quadrado " + quadrado.calcularArea());
        System.out.println("área do triangulo " + triangulo.calcularArea());
        System.out.println("área do retangulo " + retangulo.calcularArea());

    }

}
