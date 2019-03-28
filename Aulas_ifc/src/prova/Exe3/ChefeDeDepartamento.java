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
public class ChefeDeDepartamento extends Funcionario{
   
    
    private String departamento;

    public ChefeDeDepartamento(String departamento, double salario, String nome, long cpf) {
        super(salario, nome, cpf);
        this.departamento = departamento;
    }
    
    
}
