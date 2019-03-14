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
public class Retangulo implements FormasGeometricas{

    
      private int base, altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
      
      
    @Override
    public int calcularArea() {
        int resultado;
        
        resultado = base*altura;
    
    return resultado;
    }
    
}
