/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula11.Exe1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class LoginFrame extends JFrame {

    private JTextField txtLogin;
    private JLabel lblSenha;
    private JLabel lblLogar;
    private JButton btnLogar;
    private JButton btnCancelar;
    private JPasswordField txtSenha;

    public LoginFrame() {
        initComponentes();
        initEventos();

    }

    private void initComponentes() {
        super.setTitle("Login");
        super.setBounds(0, 0, 250, 200);
        super.setLayout(null);
        lblLogar = new JLabel("login");
        lblSenha = new JLabel("Senha");
        txtLogin = new JTextField();
        txtSenha = new JPasswordField();
        btnLogar = new JButton(UIManager.getIcon("FileView.FloppyDriveIcon"));
        btnLogar.setText("Logar");
        btnCancelar = new JButton("Cancelar");

        // posicionando os elementos
        lblLogar.setBounds(30, 30, 80, 25);
        lblSenha.setBounds(30, 75, 80, 25);
        txtLogin.setBounds(100, 30, 120, 25);
        txtSenha.setBounds(100, 75, 120, 25);
        btnLogar.setBounds(20, 120, 100, 25);
        btnCancelar.setBounds(125, 120, 100, 25);

        super.getContentPane().add(lblLogar);
        super.getContentPane().add(lblSenha);
        super.getContentPane().add(txtLogin);
        super.getContentPane().add(txtSenha);
        super.getContentPane().add(btnLogar);
        super.getContentPane().add(btnCancelar);

    }

    private void initEventos() {

        ActionListener ouvindoBotaoLogar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String textoLogin = txtLogin.getText();
                String textoSenha = String.valueOf(txtSenha.getPassword());

                if (textoLogin.equals("aluno")&&textoSenha.equals("ifcfraiburgo")) {
                    
                  JOptionPane.showMessageDialog(null,"Logado com sucesso");
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null,"Usuario ou senha invalida");
                }
                
                
            }
        };
        btnLogar.addActionListener(ouvindoBotaoLogar);

    }

}
