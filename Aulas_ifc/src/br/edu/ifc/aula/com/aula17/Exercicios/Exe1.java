/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula17.Exercicios;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author aluno
 */
public class Exe1 {

    public static void main(String[] args) {

        java.util.List<String> cores = new ArrayList();

        cores.add("Rosa");
        cores.add("Verde");
        cores.add("Preto");
        cores.add("Azul");
        cores.add("Vermelho");

        cores.add(0, "cinza");

        Collections.shuffle(cores);

        System.out.println("---------------Embaralhada--------------");
        for (String cor : cores) {
            System.out.println(cor);

        }

        Collections.sort(cores);

        System.out.println("-------------------Ordenada--------------");

        cores.forEach((cor) -> {
            System.out.println(cor);
        });

        System.out.println("Primeiro " + cores.get(0));
        System.out.println("Ultimo " + cores.get(cores.size() - 1));

        for (String cor : cores) {
            if (cor.equals("Azul") || cor.equals("Amarelo") || cor.equals("Vermelho")) {
                System.out.println("Primarias "+cor);
            }
        }
       
       
        
       
        System.out.println("Imprime todos elementos");
        
       cores.forEach((cor) -> {
            System.out.println(cor);
        });

    }

}
