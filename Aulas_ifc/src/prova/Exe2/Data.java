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
public class Data {
   private final int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
   
    
    
   @Override
    public String toString(){
        
       return dia+ "/ "+ mes+" / "+ ano; 
    }
   
}
