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
public class Vendas {

    double valor;
    int codigo;

    public Vendas(double valor, int codigo) {
        this.valor = valor;
        this.codigo = codigo;
    }

    public void calculaDesconto() throws Exception {

        switch (this.codigo) {

            case 1:

                this.valor = (this.valor * 0.95);

                break;
            case 2:

                this.valor = (this.valor * 0.90);

                break;
            case 3:

                this.valor = (this.valor * 0.20);

                break;
            case 4:

                this.valor = (this.valor * 0.50);

                break;

            default:
                throw new Exception("Codigo de desconto invalido");

        }
        mostraDesconto();

    }
    
    public void mostraDesconto(){
        JOptionPane.showMessageDialog(null, this.valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
