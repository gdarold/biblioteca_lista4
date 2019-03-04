/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Velho extends Imovel{

    public Velho(double preco, String endereco) {
        super(preco, endereco);
    }

    
    
    
    @Override
    public void adicional(double valor) {
          this.setPreco(this.preco-=valor);
        
        JOptionPane.showMessageDialog(null, "O valor de desconto é: "+valor+" o novo valor do imovel é: "+this.getPreco());
    }
    
}
