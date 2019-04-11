/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula12;

import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class CheckBoxFrame extends JFrame implements ItemListener {

    private JTextField textField;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;
    private JCheckBox lowerCheckBox;
    private JCheckBox upperCheckBox;
    private ButtonGroup grupo;

    public CheckBoxFrame() {
        super("Testes com checkbox");
        setLayout(new FlowLayout());

        textField = new JTextField("Veja a fonte sendo alterada", 25);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        this.add(textField);

        boldCheckBox = new JCheckBox("Negrito");
        italicCheckBox = new JCheckBox("Italico");
        lowerCheckBox = new JCheckBox("Caixa baixa");
        upperCheckBox = new JCheckBox("Caixa alta");
        grupo = new ButtonGroup();
        grupo.add(lowerCheckBox);
        grupo.add(upperCheckBox);
        add(boldCheckBox);
        add(italicCheckBox);
        add(lowerCheckBox);
        add(upperCheckBox);

        // Adiciona listener aos checkbox
        boldCheckBox.addItemListener(this);
        italicCheckBox.addItemListener(this);
        lowerCheckBox.addItemListener(this);
        upperCheckBox.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        Font fonte = null;

        if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
            fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        } else if (boldCheckBox.isSelected()) {
            fonte = new Font("Serif", Font.BOLD, 14);
        } else if (italicCheckBox.isSelected()) {
            fonte = new Font("Serif", Font.ITALIC, 14);
        } else if (lowerCheckBox.isSelected()) {
            textField.setText(textField.getText().toLowerCase());
           
        } else if (upperCheckBox.isSelected()) {
            textField.setText(textField.getText().toUpperCase());
           
        }else {
            fonte = new Font("Serif", Font.PLAIN, 14);
        }

        textField.setFont(fonte);
    }

    public static void main(String[] args) {
        CheckBoxFrame frame = new CheckBoxFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(415, 100);
        frame.setVisible(true);
    }
}
