/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.Exe2;

/**
 *
 * @author aluno
 */
public class EntradaNaAgenda extends DataHora {

    private final String evento;

    public EntradaNaAgenda(int dia, int mes, int ano, int hor, int min, int seg, String ev) {
     
        super( dia, mes, ano,hor, min, seg);
        evento = ev;
    }

    @Override
    public String toString() {

        return super.toString() + " ->" + evento;

    }

    public static void main(String[] args) {
        EntradaNaAgenda agenda = new EntradaNaAgenda(23, 3, 2019, 10, 29, 20, "Criando tarefas java");

        System.out.println(agenda.toString());
    }

}
