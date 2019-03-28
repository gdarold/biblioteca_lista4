/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.Exe4;

/**
 *
 * @author aluno
 */
public abstract class Dados implements ObjetoGeometrico{
    
    protected double raio;
    protected double base;
    protected double altura;

    public Dados(double raio) {
        this.raio = raio;
    }

    public Dados(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
}
