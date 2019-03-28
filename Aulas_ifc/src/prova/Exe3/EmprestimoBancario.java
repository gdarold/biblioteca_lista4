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
public class EmprestimoBancario {

    public static Double calculaEmprestimo(Pessoa p) {
        Double valor = null;

        try {
            // caso seja passado valor do salario null ira retornar um ponteiro nullo e o calculo não podera ser executado
            if (p instanceof ChefeDeDepartamento) {
                ChefeDeDepartamento objeto = (ChefeDeDepartamento) p;
                valor = objeto.getSalario() * 4.0;

            } else if (p instanceof Funcionario) {
                Funcionario objeto = (Funcionario) p;
                valor = objeto.getSalario() * 2.0;

            } else if (p instanceof Pessoa) {
                valor = 1000D;

            }

            return valor;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            return valor = 0.0;
        }
    }

    public static void main(String[] args) {
      
        Pessoa p1 = new Pessoa("Carlos", 56487451233L);

        Funcionario f1 = new Funcionario(2500.0, "Fernando", 96547841254L);

        ChefeDeDepartamento c1 = new ChefeDeDepartamento("Analista de Sistemas", 6500.0, "Rosane", 64976154673l);

        System.out.println(calculaEmprestimo(p1));
        System.out.println(calculaEmprestimo(f1));
        System.out.println(calculaEmprestimo(c1));

    }

}
