/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ButtonFrame extends JFrame implements ActionListener {

    private JButton btnTexto;
    private JButton btnIcone;
    private JButton btnSalvar;

    public ButtonFrame() {
        super("Testando Botões");
        setLayout(new FlowLayout());

        btnTexto = new JButton("Clique Aqui");
        add(btnTexto);

        Icon icon1 = new ImageIcon("add2-24.png");
        Icon icon2 = new ImageIcon("add2-48.png");
        btnIcone = new JButton("Com Ícone", icon1);
        btnIcone.setRolloverIcon(icon2);
        add(btnIcone);
        btnSalvar = new JButton("Salvar");
        add(btnSalvar);

        btnIcone.addActionListener(this);
        btnTexto.addActionListener(this);
        btnSalvar.addActionListener(this);

        // btnIcone.addActionListener(new ActionListener() {
// @Override
        // public void actionPerformed(ActionEvent e) {
        // // Novo listener adicionado
        // JOptionPane.showMessageDialog(ButtonFrame.this, "Segundo Listener adicionado no botão com ícone");
        // }
        // });
        //
        // btnTexto.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // // Apenas chamando o listener da classe
// ButtonFrame.this.actionPerformed(e);
// }
        // });
    }

    /**
     * 51 * Evento será capturado ao teclar entre dentro do campo 52 * 53
     *
     *
     * @param e 54
     */
    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Com Ícone") || e.getActionCommand().equals("Clique Aqui")) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você clicou: %s", e.getActionCommand()));
        } else {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Salvo com sucesso!"));
        }
    }

    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);
        frame.setVisible(true);
        frame.setFocusable(true);
    }

}
