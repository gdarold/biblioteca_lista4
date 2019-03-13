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
public class Main {

    public static void main(String[] args) {

        DAOGeral cliente = new Cliente(1, "Jose");

        cliente.inserir();
        cliente.excluir();
        cliente.listar();

        DAOGeral arroz = new Produto(10, "arroz");
        DAOGeral feijao = new Produto(11, "feijao");
        DAOGeral macarrao = new Produto(12, "macarrao");

        arroz.inserir();
        arroz.listar();
        feijao.listar();
        macarrao.inserir();
        macarrao.excluir();
        macarrao.listar();
        //macarrao.getDescricao();
        
        
    }

}
