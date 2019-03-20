/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.FileSystemException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.activation.MimetypesFileTypeMap;



/**
 *
 * @author aluno
 */
public class ArquivoUtil {

    private static final String EXTENSAO = "txt";
    private static final String DESCRICAO = "Apenas arquivos texto (.txt)";

    public static File abreArquivoTexto() throws FileSystemException, FileNotFoundException {
        JFileChooser fileChosser = new JFileChooser();
        fileChosser.setFileFilter(criarFiltro());
        fileChosser.setAcceptAllFileFilterUsed(true);
        int retorno = fileChosser.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChosser.getSelectedFile();
            validarArquivoTexto(arquivo);
            return arquivo;
        }
        throw new FileNotFoundException("Arquivo não encontrado");

    }

    private static FileFilter criarFiltro() {
        return new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().toLowerCase().endsWith(EXTENSAO);
            }

            @Override
            public String getDescription() {
                return DESCRICAO;

            }

        };

    }

    private static void validarArquivoTexto(File arquivo) throws FileNotFoundException, FileSystemException {
        if (arquivo == null) {

            throw new FileNotFoundException("Arquivo não existe");

        }
        if (arquivo.isFile()) {
            String mimes = new MimetypesFileTypeMap().getContentType(arquivo);
            System.out.println(mimes);
            if (mimes == null || !mimes.equals("text/plain")) {
                throw new FileSystemException("Arquivo invalidado");
            }
        }

    }

    public static void escreverArquivoTexto(File arquivo, String texto) throws Exception{

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
            bw.write(texto);

    }

    public static String lerArquivoTexto(File arquivo) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(arquivo));
        StringBuilder sb = new StringBuilder();
        while (in.hasNext()) {
            sb.append(in.next());
        }
        in.close();
        return sb.toString();
    }
}
