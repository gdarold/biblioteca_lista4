/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula11.Exe1;

import javax.swing.*;

/**
 *
 * @author aluno
 */
public class LoginFrame extends JFrame{
    
    
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
    
    
    private void initComponentes(){
        super.setTitle("Login");
        super.setBounds(0,0,250,200);
        super.setLayout(null);
        lblLogar = new JLabel("login");
        lblSenha = new JLabel("Senha");
        txtLogin = new JTextField();
        txtSenha = new JPasswordField();
        btnLogar = new JButton(UIManager.getIcon("FileView.FloppyDriveIcon"));
        btnLogar.setText("Logar");
        btnCancelar = new JButton("Cancelar");
        
    }
    
  private void initEventos(){
      
      
      
      
  }
    
    
}
