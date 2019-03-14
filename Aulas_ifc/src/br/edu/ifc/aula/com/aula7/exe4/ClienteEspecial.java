/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7.exe4;

/**
 *
 * @author aluno
 */
public class ClienteEspecial extends ContaCorrente {

    public ClienteEspecial() {
    }

    public ClienteEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        
        double taxa;
        if(this.getSaldo()<=valor){
            System.out.println("Não é possivel efeturar o saque");
            
        }else{
            taxa = (valor*0.1)/100;
            this.setSaldo(this.getSaldo()-valor-taxa);
            System.out.println("Saque efetuado com sucesso");
        }
    }
    
    

}
