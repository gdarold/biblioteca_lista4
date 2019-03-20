/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula9.exe1;

/**
 *
 * @author aluno
 */
public class Filme {

    private String titulo;
    private int duracaoEmMinutos;

    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras() {

        
        int duracaoHoras, minutos;
        
        if(this.duracaoEmMinutos>0){
        duracaoHoras = this.duracaoEmMinutos / 60;
        minutos = this.duracaoEmMinutos - (duracaoHoras * 60);

        if (minutos > 0) {
            System.out.println("O filme " + this.titulo + " possui " + duracaoHoras + " horas e " + minutos + " minutos de duração ");
        } else {
            System.out.println("O filme " + this.titulo + " possui " + duracaoHoras + " horas de duração ");

        }
        }else{
            System.out.println("Valor incorreto");
            
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}
