/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.teste;

/**
 *
 * @author aluno
 */
public class Of76 extends Clowns{
    
    public static void main(String[] args) {
       
        Nose[] i = new Nose[3];
     
        i[0]= new Acts();
        i[1]= new Clowns();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod()+" "+i[x].getClass());
        }
        
    }
    
    
}
