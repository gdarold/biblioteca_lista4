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
public class Quadrado implements FormasGeometricas {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    
    @Override
    public int calcularArea() {

        int resultado;

        resultado = lado * lado;

        return resultado;
    }

}
