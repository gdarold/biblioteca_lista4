/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class PrimeiraInterface extends javax.swing.JFrame {

    private JButton btnSalvar;
    private JButton btnCancelar;
    private JButton btnAbrir;
    private JButton btnAjuda;
    private JButton btnSul;

    public PrimeiraInterface() {
        super("Primeiro exemplo");
        super.setSize(300, 300);
        super.setVisible(false);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnSalvar = new JButton("Salvar");
        btnAbrir = new JButton("Abrir");
        btnCancelar = new JButton("Cancelar");
        btnAjuda = new JButton("Ajuda");
        btnSul = new JButton("Sul");

        Container c1 = super.getContentPane();
        c1.setLayout(new BorderLayout());
        //c1.add(BorderLayout.CENTER, btnSalvar);
        c1.add(BorderLayout.EAST, btnAbrir);
        c1.add(BorderLayout.WEST, btnCancelar);
        c1.add(BorderLayout.NORTH, btnAjuda);
        c1.add(BorderLayout.SOUTH, btnSul);

        Container c2 = new Panel();
        c2.setLayout(new GridLayout(4,1));
        c2.add(new JButton("A"));
        c2.add(new JButton("B"));
         c2.add(new JButton("C"));
          c2.add(new JButton("D"));
        
        c1.add(BorderLayout.CENTER, c2);

    }

}
