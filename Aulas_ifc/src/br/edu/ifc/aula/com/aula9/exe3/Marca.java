/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula9.exe3;



/**
 *
 * @author aluno
 */
public class Marca {
    
    private int id;
    private String marca;
    private int ano;
   
    public Marca() {
    }

    public Marca(int id, String marca, int ano) {
        this.id = id;
        this.marca = marca;
        this.ano = ano;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

      
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marca{" + "id=" + id + ", marca=" + marca + ", ano=" + ano + '}';
    }
    
    
}
