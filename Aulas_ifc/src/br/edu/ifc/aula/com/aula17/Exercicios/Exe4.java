/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula17.Exercicios;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author aluno
 */
public class Exe4 {

    public static void main(String[] args) {

        Stack pilha = new Stack();

        pilha.push(10);
        pilha.push(11);
        pilha.push(12);
        pilha.push(13);
        pilha.push(15);
        
        System.out.println("Embaralhando\n");
        Collections.shuffle(pilha);

        System.out.println("Dados pilha\n");
        System.out.println("Primeiro elemento " + pilha.firstElement());
        System.out.println("Topo sem remover " + pilha.peek());
        System.out.println("Topo removendo " + pilha.pop());

        System.out.println("Tamanho pilha " + pilha.size());
        System.out.println("Tamanho pilha " + pilha.toString());
    }
}
