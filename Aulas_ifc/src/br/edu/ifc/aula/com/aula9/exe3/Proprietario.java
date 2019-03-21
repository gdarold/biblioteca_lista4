/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula9.exe3;

/**
 *
 * @author aluno
 */
public class Proprietario {

    private String nome;
    private long cpf;
    private long rg;
    private Endereco endereco;

    public Proprietario(String nome, long cpf, long rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + '}';
    }

    
}
