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
public class ContaCorrente implements Conta {

    private double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }
    
    

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    
    

    @Override
    public void depositar(double valor) {
        
        this.saldo = this.saldo+valor;
        
    }

    @Override
    public void sacar(double valor) {
        double taxa;
        if(this.saldo<=valor){
            System.out.println("Não é possivel efeturar o saque");
            
        }else{
            taxa = (valor*0.5)/100;
            this.saldo = this.saldo-valor-taxa;
            System.out.println("Saque efetuado com sucesso");
        }
        
   }

    @Override
    public void saldo() {
        System.out.println("O saldo da conta é "+this.saldo);
        
   }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
   
}
