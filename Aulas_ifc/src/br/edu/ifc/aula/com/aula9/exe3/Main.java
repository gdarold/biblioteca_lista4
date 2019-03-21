/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula9.exe3;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Marca woks = new Marca(1, "Fiat", 2019);
        Endereco end = new Endereco("das flores", "portal", "Fray", "SC", 8958000, "perto da arena");
        
        Proprietario jose = new Proprietario("pedro", 55555555l, 99999999l, end);
        
        Carro gol = new Carro(woks, jose);
        gol.setAno(2019);
        gol.setChassi(555555);
        gol.setModelo("sport");
        gol.setCor("azul");
        gol.setMarcha_atual(1);
        gol.setNr_marchas(5);
        gol.setTem_cambio_autom(false);
        gol.setTem_teto_solar(true);
        gol.setVelocidade_maxima(240);
        gol.setVelocidade_atual(1);
        gol.setVolume_combustivel(40);
        gol.setNr_portas(5);
        
        System.out.println(" "+gol.toString());
        
       
        gol.acelera();
       // gol.freia();
        gol.trocarMarcha();
        gol.trocarMarcha();
         gol.trocarMarcha();
           gol.trocarMarcha();
           gol.comGasolinaAditivada(50);
            
        
        
        
        
    }
    
}
