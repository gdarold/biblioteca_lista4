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
public class Cliente implements DAOGeral{

    private int codigo;
    private String nome;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    
    
    
    @Override
    public void inserir() {
        System.out.println("Inserindo Cliente!");
        
    }

    @Override
    public void excluir() {
         System.out.println("Excluindo Cliente!");
   }

    @Override
    public void listar() {
         System.out.println("Listando Clientes!");
    }
    
}
