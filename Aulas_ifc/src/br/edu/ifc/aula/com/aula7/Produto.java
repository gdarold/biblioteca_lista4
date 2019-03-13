/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7;

/**
 *
 * @author aluno
 */
public class Produto implements DAOGeral, DAOEstoque {

    private int numero;
    private String descricao;

    public Produto(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo Produto!");
    }

    @Override
    public void excluir() {
        System.out.println("Inserindo Produto!");
    }

    @Override
    public void listar() {
        System.out.println("Inserindo Produto!");
    }

    @Override
    public void baixar() {
        System.out.println("Baixando estoque!");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
