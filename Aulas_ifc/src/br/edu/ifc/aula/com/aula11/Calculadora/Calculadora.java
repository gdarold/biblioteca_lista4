/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula11.Calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class Calculadora extends javax.swing.JFrame implements ActionListener {

    private JTextField calculo;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botao0;
    private JButton botaoDividir;
    private JButton botaoSoma;
    private JButton botaoSubtracao;
    private JButton botaoMultiplicar;
    private JButton botaoPonto;
    private JButton botaoIgual;
    private JButton limparTela;
    private double resultado;
    private String operacao;
    private double valor2;

    public Calculadora() {

        initComponentes();
        adicionaListener();
    }

    private void initComponentes() {
        super.setTitle("Calculadora");
        super.setSize(300, 300);
        super.setVisible(false);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        calculo = new JTextField();
        calculo.setPreferredSize(new Dimension(25, 30));
        calculo.setEditable(false);

        botao0 = new JButton("0");
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        botaoDividir = new JButton("/");
        botaoIgual = new JButton("=");
        botaoMultiplicar = new JButton("*");
        botaoPonto = new JButton(".");
        botaoSoma = new JButton("+");
        botaoSubtracao = new JButton("-");
        limparTela = new JButton("Limpa Tela");

        Container c1 = super.getContentPane();
        c1.setLayout(new BorderLayout());
        //c1.add(BorderLayout.CENTER, btnSalvar);
        //c1.add(BorderLayout.EAST, btnAbrir);
        //c1.add(BorderLayout.WEST, btnCancelar);
        c1.add(BorderLayout.NORTH, calculo);
        c1.add(BorderLayout.SOUTH, limparTela);

        Container c2 = new Panel();
        c2.setLayout(new GridLayout(4, 4));
        c2.add(botao7);
        c2.add(botao8);
        c2.add(botao9);
        c2.add(botaoDividir);//
        c2.add(botao4);
        c2.add(botao5);
        c2.add(botao6);
        c2.add(botaoMultiplicar);//
        c2.add(botao1);
        c2.add(botao2);
        c2.add(botao3);
        c2.add(botaoSubtracao);//
        c2.add(botao0);
        c2.add(botaoPonto);//
        c2.add(botaoIgual);
        c2.add(botaoSoma);//

        c1.add(BorderLayout.CENTER, c2);
    }

    public void adicionaListener() {
        botao0.addActionListener(this);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
        botao6.addActionListener(this);
        botao7.addActionListener(this);
        botao8.addActionListener(this);
        botao9.addActionListener(this);
        botaoDividir.addActionListener(this);
        botaoIgual.addActionListener(this);
        botaoMultiplicar.addActionListener(this);
        botaoPonto.addActionListener(this);
        botaoSubtracao.addActionListener(this);
        botaoSoma.addActionListener(this);
        limparTela.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String tela = event.getActionCommand();
        try{
        switch (event.getActionCommand()) {
            case "0":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "1":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "2":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "3":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "4":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "5":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "6":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "7":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "8":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "9":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "+":
                //calculo.setText(this.calculo.getText() + tela);
                resultado = Double.parseDouble(calculo.getText());
                operacao = "+";
                calculo.setText(" ");
                break;
            case "-":
                //calculo.setText(this.calculo.getText() + tela);
                resultado = Double.parseDouble(calculo.getText());
                operacao = "-";
                calculo.setText(" ");
                break;
            case "/":
                // calculo.setText(this.calculo.getText() + tela);
                resultado = Double.parseDouble(calculo.getText());
                operacao = "/";
                calculo.setText(" ");
                break;
            case "*":
                // calculo.setText(this.calculo.getText() + tela);
                resultado = Double.parseDouble(calculo.getText());
                operacao = "*";
                calculo.setText(" ");
                break;
            case ".":
                calculo.setText(this.calculo.getText() + tela);
                break;
            case "Limpa Tela":
                calculo.setText(" ");
                resultado = 0;
                operacao = " ";
                break;

            case "=":
                
                if(resultado!=0 &&!operacao.equals(" ")){
                System.out.println("faz o calculo");
                valor2 = Double.parseDouble(calculo.getText());
                
                
                switch (operacao) {

                    case "+":

                        resultado = resultado + valor2;
                        calculo.setText(String.valueOf(resultado));

                        break;

                    case "-":

                        resultado = resultado - valor2;
                        calculo.setText(String.valueOf(resultado));

                        break;
                    case "/":

                        resultado = resultado / valor2;
                        calculo.setText(String.valueOf(resultado));

                        break;

                    case "*":

                        resultado = resultado * valor2;
                        calculo.setText(String.valueOf(resultado));

                        break;

                    default:

                        //resultado  = resultado;
                        calculo.setText(String.valueOf(resultado));

                        break;

                }
                break;
                }
            default:
                calculo.setText(String.valueOf(0));

                break;
        }

    }catch(NumberFormatException ex){
        
        
    }
    }

}
