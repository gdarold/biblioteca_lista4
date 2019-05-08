/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula18;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author aluno
 */
public class FormaLista {

    public FormaLista() {
    }

    public List<Aluno> CriaLista() {
        List<Aluno> alunos = new ArrayList<>();

        /**
         * Creates new form GuiAluno
         */
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

        return alunos;
    }

}
