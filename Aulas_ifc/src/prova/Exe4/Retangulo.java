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
public class Retangulo extends Dados {

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {

        double area = 0;
        area = base * altura;

        return area;

    }

    @Override
    public double calcularPerimetro() {

        double perimetro = 0;
        perimetro = 2.0 * (base * altura);

        return perimetro;

    }

}
