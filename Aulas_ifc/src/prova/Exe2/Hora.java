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
public class Hora {

    private final int hora, minuto, segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {

        return hora + ": " + minuto + " : " + segundo;
    }

}
