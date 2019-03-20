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
public class Livro {
    
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    
    
    public void verificarProcesso() throws NumberFormatException{
        
        double porcentagem;
        
      
            
        if (this.paginasLidas< this.qtdPaginas) {   
        porcentagem = (this.paginasLidas*100)/this.qtdPaginas;
      
        System.out.println("Você ja leu "+porcentagem+ " por cento do livro" );
        }else{
       
            throw new NumberFormatException("Numero de paginas menor que quantidade paginas lidas");
            
        }
    }
    
    
    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
    
    
       
    
    
    
    
    
    
}
