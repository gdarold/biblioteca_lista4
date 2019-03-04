/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio5;

/**
 *
 * @author Gabriel
 */
public abstract class Imovel extends Object {

    protected double preco;
    private String endereco;

    public Imovel(double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }

    public Imovel() {
    }

    public abstract void adicional(double valor);

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel{" + "preco=" + preco + ", endereco=" + endereco + '}';
    }

    
    
}
