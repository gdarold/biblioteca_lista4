/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Vip extends Ingresso {

    private double valorAdicional;

    public Vip(double valor) {
        super(valor);
    }

    public Vip(double valorAdicional, double valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    /**
     *
     */
    @Override
    public void imprimeValor() {
        JOptionPane.showMessageDialog(null, "Ingresso "+ this.getClass().getSimpleName()+" com o valor  " + this.getValor());
    }

    public void valorAdicional(double adcional) {
        this.valorAdicional = adcional;
        this.setValor(this.getValor() + valorAdicional);
        imprimeValor();
    }

   

}
