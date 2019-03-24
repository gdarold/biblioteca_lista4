/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe3;

/**
 *
 * @author Gabriel
 */
public class Idades {
   
    int idade[];

    public Idades(int idade[]) {
        this.idade = idade;
    }

    public void calculaMaiorMenor(){
        int menor = 100, maior = 0;
        for (int i : idade) {
            if(i> maior){
                maior=i;
            }
            if(i<menor){
                menor = i;
                
            }
        }
               
    }
    
        
    

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }
    
    
    
    
    
    
    
    
    
}
