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
public class CamaroteInferior extends Vip{
    
    private String localizacao;
    public CamaroteInferior(double valor) {
        super(valor);
    }

    public CamaroteInferior(String localizacao, double valor) {
        super(valor);
        this.localizacao = localizacao;
    }
    
    public void imprimeLocal(){
        JOptionPane.showMessageDialog(null, "A localização do camarote inferior é "+this.localizacao);
       
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

  
}
