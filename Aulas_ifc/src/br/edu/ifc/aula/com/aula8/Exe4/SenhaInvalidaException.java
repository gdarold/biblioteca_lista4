/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe4;

/**
 *
 * @author Gabriel
 */
public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ERRO " + super.getMessage();
    }

}
