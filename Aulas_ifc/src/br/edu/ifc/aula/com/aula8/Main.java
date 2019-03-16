/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        try {
            File arquivo = new File("/home/aluno/teste.txt");
            ArquivoUtil.escreverArquivoTexto(arquivo, "Olá mundo \n\nEstou escrevendo no arquivo texto \n\n showwwwww");
            arquivo = ArquivoUtil.abreArquivoTexto();
            String texto = ArquivoUtil.lerArquivoTexto(arquivo);
            
            System.out.println(texto);
            JOptionPane.showMessageDialog(null, "Deu certo");

        } catch (FileNotFoundException | FileSystemException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
