/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula18;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author aluno
 */
public class Teste {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        Faker fake = new Faker(new Locale("pt-BR"));

        for (int i = 0; i < 40; i++) {

            Long matricula = fake.number().numberBetween(0L, 100000L);
            String nome = fake.name().fullName();
            Date dtnascimento = fake.date().birthday();
            Double bolsa = fake.number().randomDouble(2, 100, 500);
            boolean matriculado = fake.random().nextBoolean();

            Aluno aluno = new Aluno(matricula, nome, dtnascimento, bolsa, matriculado);
            alunos.add(aluno);

        }

        System.out.println(Arrays.asList(alunos));
   

        alunos.sort((Aluno t, Aluno t1) -> t.getNome().compareTo(t1.getNome()));

        alunos.forEach((aluno) -> {
            System.out.println(aluno.toString());
        });
        
    }
    
   
    
   

}
