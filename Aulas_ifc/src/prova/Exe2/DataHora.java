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
public class DataHora extends Data {

    private final Hora hora;

    public DataHora(int dia, int mes, int ano, int hor, int min, int seg) {
        super(dia, mes, ano);
        hora = new Hora(hor, min, seg);
    }

    @Override
    public String toString(){
        return super.toString()+" :  "+hora.toString();
        
        
    }
}
