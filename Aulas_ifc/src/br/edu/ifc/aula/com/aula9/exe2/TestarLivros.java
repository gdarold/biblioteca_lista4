/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula9.exe2;

/**
 *
 * @author aluno
 */
public class TestarLivros {
    
    public static void main(String[] args) {
        
        Livro pequenoPrincipe = new Livro("O pequeno principe");
        
        pequenoPrincipe.setQtdPaginas(98);
        System.out.println("O livro "+pequenoPrincipe.getTitulo()+" possui "+pequenoPrincipe.getQtdPaginas()+" páginas");
        
        pequenoPrincipe.setPaginasLidas(20);
        pequenoPrincipe.verificarProcesso();
        pequenoPrincipe.setPaginasLidas(50);
        
        pequenoPrincipe.verificarProcesso();
        
        Livro meuLivro = new Livro("Padrões de projeto", 515, 55);
        meuLivro.verificarProcesso();
        
        
          System.out.println("O livro "+meuLivro.getTitulo()+" possui "+meuLivro.getQtdPaginas()+" páginas");
        
    }
    
    
    
       
    
}
