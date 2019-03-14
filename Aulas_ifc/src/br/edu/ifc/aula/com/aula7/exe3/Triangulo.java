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
public class Triangulo implements FormasGeometricas {

    private int base, altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public int calcularArea() {
        int resultado;

        resultado = (base * altura)/2;

        return resultado;

    }

}
