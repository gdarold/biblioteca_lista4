/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.Exe4;

/**
 *
 * @author aluno
 */
public class Circulo extends Dados{

    public Circulo(double raio) {
        super(raio);
    }

    @Override
    public double calcularArea() {
        double area =0;
        area = Math.PI*raio*raio;
        
        return area;
      
         }

    @Override
    public double calcularPerimetro() {
        
        double perimetro =0;
        perimetro = 2.0*Math.PI*raio;
        
        return perimetro;
        
        
    }
   
}
