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
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class Calculadora extends javax.swing.JFrame {

    
    private JTextField calculo;

    public Calculadora() {
        super("Calculadora");
        super.setSize(300, 300);
        super.setVisible(false);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        calculo = new JTextField();
        calculo.setPreferredSize(new Dimension (25,30));

        Container c1 = super.getContentPane();
        c1.setLayout(new BorderLayout());
        //c1.add(BorderLayout.CENTER, btnSalvar);
        //c1.add(BorderLayout.EAST, btnAbrir);
        //c1.add(BorderLayout.WEST, btnCancelar);
        c1.add(BorderLayout.NORTH, calculo);
        //c1.add(BorderLayout.SOUTH, btnSul);

        Container c2 = new Panel();
        c2.setLayout(new GridLayout(4,4));
        c2.add(new JButton("7"));
        c2.add(new JButton("8"));
         c2.add(new JButton("9"));
          c2.add(new JButton("/"));
          c2.add(new JButton("4"));
          c2.add(new JButton("5"));
          c2.add(new JButton("6"));
          c2.add(new JButton("*"));
           c2.add(new JButton("1"));
          c2.add(new JButton("2"));
          c2.add(new JButton("3"));
          c2.add(new JButton("-"));
          c2.add(new JButton("0"));
          c2.add(new JButton("."));
          c2.add(new JButton("="));
          c2.add(new JButton("+"));
          
        
        c1.add(BorderLayout.CENTER, c2);

    }

}
