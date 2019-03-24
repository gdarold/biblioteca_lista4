/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) throws Exception {

        double numero;
        int  desconto;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor do produto"));
        desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de desconto"));

        Vendas venda1 = new Vendas(numero, desconto);
        
        venda1.calculaDesconto();
        
    }

}
