/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula17.Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 *
 * @author aluno
 */
public class Exe3 {
    
    
    public static void main(String[] args) {
        
         java.util.List<Cor> cores = new ArrayList();

        cores.add(new Cor("Rosa"));
        cores.add(new Cor("Verde"));
        cores.add(new Cor("Preto"));
        cores.add(new Cor("Azul"));
        cores.add(new Cor("Vermelho"));

        cores.add(0, new Cor("cinza"));

        Collections.shuffle(cores);

        System.out.println("---------------Embaralhada--------------");
        for (Cor cor : cores) {
            System.out.println(cor.getNome());

        }

        cores.sort(new Comparator<Cor>(){
             @Override
             public int compare(Cor t, Cor t1) {
                
             return t.getNome().compareTo(t1.getNome());
             }
        
        });
    

        System.out.println("-------------------Ordenada--------------");

        cores.forEach((cor) -> {
            System.out.println(cor.getNome());
        });

        System.out.println("Primeiro " + cores.get(0).getNome());
        System.out.println("Ultimo " + cores.get(cores.size() - 1).getNome());

        for (Cor cor : cores) {
            if (cor.equals("Azul") || cor.equals("Amarelo") || cor.equals("Vermelho")) {
                System.out.println("Primarias "+cor.getNome());
            }
        }
       
        cores.removeIf(new Predicate<Cor>(){
             @Override
             public boolean test(Cor t) {
          
             return t.getNome().startsWith("A");
             }
           
           
           
       });
        
        
       
        System.out.println("Imprime todos elementos");
        
       cores.forEach((cor) -> {
            System.out.println(cor.getNome());
        });

    
        
    }
}

class Cor{
    
    private String nome;

    public Cor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
    
}