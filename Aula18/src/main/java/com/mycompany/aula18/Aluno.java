/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula18;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Aluno {
    
    private Long matricula;
    private String nome;
    private Date dtnascimento;
    private Double valorbolsa;
    private boolean matriculado;

    public Aluno(Long matricula, String nome, Date dtnascimento, Double valorbolsa, boolean matriculado) {
        this.matricula = matricula;
        this.nome = nome;
        this.dtnascimento = dtnascimento;
        this.valorbolsa = valorbolsa;
        this.matriculado = matriculado;
    }
    
    
    
    
    
}
