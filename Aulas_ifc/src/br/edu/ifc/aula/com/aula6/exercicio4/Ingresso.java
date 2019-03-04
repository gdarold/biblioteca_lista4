/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio4;

/**
 *
 * @author Gabriel
 */
public abstract class Ingresso {
    
    
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }
    
   
    public abstract void imprimeValor();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
