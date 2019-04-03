/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula11;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author aluno
 */
public class PrimeiraInterface extends javax.swing.JFrame{
    
    
    private JButton btnSalvar;

    public PrimeiraInterface() {
        super("Primeiro exemplo");
        super.setSize(300,300);
        super.setVisible(false);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    
    public static void main(String[] args) {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable(){
                @Override
                public void run() {
                    
                    
                }
                
                
            });
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PrimeiraInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrimeiraInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
