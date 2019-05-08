/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula18;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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

    public Long getIdade() {
        LocalDate dtNascimento = this.dtnascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dtAtual = LocalDate.now();
        Long idade = ChronoUnit.YEARS.between(dtNascimento, dtAtual);

        return idade;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public Double getValorbolsa() {
        return valorbolsa;
    }

    public void setValorbolsa(Double valorbolsa) {
        this.valorbolsa = valorbolsa;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return this.matricula
                + " \t " + this.getIdade()
                + " \t " + this.nome;

    }

}
