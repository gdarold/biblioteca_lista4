/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula9.exe1;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Filme umFilmeQualquer = new Filme("Os vingadores", 142);
        
        umFilmeQualquer.exibirDuracaoEmHoras();
        
        Filme meuFilmeFavorito = new Filme("A lagoa Azul", 100);
        
        meuFilmeFavorito.setDuracaoEmMinutos(190);
        
        meuFilmeFavorito.exibirDuracaoEmHoras();
        
        System.out.println("Os filmes no catálogo são "+umFilmeQualquer.getTitulo()+" e "+meuFilmeFavorito.getTitulo());
        
        
    }
    
}
