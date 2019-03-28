/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.Exe3;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa{
    
    private double salario;

    public Funcionario(double salario, String nome, long cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
