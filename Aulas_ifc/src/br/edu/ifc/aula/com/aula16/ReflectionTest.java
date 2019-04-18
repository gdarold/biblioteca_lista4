/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula16;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
class Aluno {

    Long matricula;
    String nome;
    Integer idade;
    List<Double> notas;

    public Aluno(Long matricula, String nome, Integer idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        notas = new ArrayList<>();
    }

}

public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno(123456L, "Antônio", 25);
        a.notas.add(5.6);
        a.notas.add(8.6);
        a.notas.add(9.6);
        a.notas.add(6.4);

        for (Field f : a.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println(f.getType() + " - " + f.getName() + " - " + f.get(a));
            if (f.getType().equals(List.class)) {
                Double soma = 0D;
                List<?> lista = (List) f.get(a);

                for (Object l : lista) {
                    if (l instanceof Double) {
                        soma += (Double) l;
                    }
                }
                System.out.printf("Média: %.2f ", (soma / lista.size()));
            }
        }
    }
}
