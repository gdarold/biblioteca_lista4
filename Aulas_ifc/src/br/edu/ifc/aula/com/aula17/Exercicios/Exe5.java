/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula17.Exercicios;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author aluno
 */
public class Exe5 {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.offer("Desligar o despertador");
        fila.offer("Ir no banheiro");
        fila.offer("Vestir a roupa");

         System.out.println("Elemento sem remover " + fila.element());
         System.out.println("Elemento removendo " + fila.poll());
                 
         System.out.println("Fila esta vazia "+fila.isEmpty());
        
    }

}
