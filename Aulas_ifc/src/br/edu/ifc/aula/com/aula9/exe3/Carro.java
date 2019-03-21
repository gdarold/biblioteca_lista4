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
public class Carro extends Abastecer implements Acoes {

    private String modelo;
    private String cor;
    private Integer ano;
    private Marca marca;
    private long chassi;
    private Proprietario proprietario;
    private Integer velocidade_maxima;
    private Integer velocidade_atual;
    private Integer nr_portas;
    private boolean tem_teto_solar;
    private Integer nr_marchas;
    private Integer marcha_atual;
    private boolean tem_cambio_autom;
    private Integer volume_combustivel;

    public Carro(Marca marca, Proprietario proprietario) {
        this.marca = marca;
        this.proprietario = proprietario;
    }

    public void volumeCombustivel() {

        System.out.println("O volume de combustuvel é " + this.volume_combustivel + " lts");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public long getChassi() {
        return chassi;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(Integer velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

    public Integer getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(Integer velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }

    public Integer getNr_portas() {
        return nr_portas;
    }

    public void setNr_portas(Integer nr_portas) {
        this.nr_portas = nr_portas;
    }

    public boolean isTem_teto_solar() {
        return tem_teto_solar;
    }

    public void setTem_teto_solar(boolean tem_teto_solar) {
        this.tem_teto_solar = tem_teto_solar;
    }

    public Integer getNr_marchas() {
        return nr_marchas;
    }

    public void setNr_marchas(Integer nr_marchas) {
        this.nr_marchas = nr_marchas;
    }

    public Integer getMarcha_atual() {
        return marcha_atual;
    }

    public void setMarcha_atual(Integer marcha_atual) {
        this.marcha_atual = marcha_atual;
    }

    public boolean isTem_cambio_autom() {
        return tem_cambio_autom;
    }

    public void setTem_cambio_autom(boolean tem_cambio_autom) {
        this.tem_cambio_autom = tem_cambio_autom;
    }

    public Integer getVolume_combustivel() {
        return volume_combustivel;
    }

    public void setVolume_combustivel(Integer volume_combustivel) {
        this.volume_combustivel = volume_combustivel;
    }

    @Override
    public void acelera() throws Exception {

        if (this.velocidade_atual < this.velocidade_maxima) {

            this.velocidade_atual = this.velocidade_atual + 1;
        } else {

            throw new Exception("Velocidade máxima alcançada");
        }

    }

    @Override
    public void freia() throws Exception {
        this.velocidade_atual = 0;
        System.out.println("CArro parou");

    }

    @Override
    public void trocarMarcha() throws Exception {

        if (this.marcha_atual < this.nr_marchas) {
            this.marcha_atual = this.marcha_atual + 1;
        } else {

            throw new Exception("Não é bitruq, o carro so tem 5 marchas");
        }

    }

    @Override
    public void reduzirMarcha() throws Exception {

        if (this.marcha_atual > 0) {
            this.marcha_atual = this.marcha_atual - 1;
        } else {

            throw new Exception("O carro está parado");
        }

    }

    @Override
    public void comGasolinaComum(int valor) {
        if (valor > 0) {
            this.volume_combustivel += valor;
            this.setAutonomia(this.volume_combustivel * 10);
        } else {

            System.out.println("valor deve ser maior que Zero");
        }

    }

    @Override
    public void comGasolinaAditivada(int valor) {
        if (valor > 0) {
            this.volume_combustivel += valor;
            this.setAutonomia(this.volume_combustivel * 14);
        } else {

            System.out.println("valor deve ser maior que Zero");
        }

    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo 
                + ", cor=" + cor + ", ano=" + ano + ", marca=" 
                + marca + ", chassi=" + chassi + ", proprietario=" 
                +proprietario + ", velocidade_maxima=" + velocidade_maxima 
                + ", velocidade_atual=" + velocidade_atual + ", nr_portas=" + nr_portas 
                + ", tem_teto_solar=" + tem_teto_solar + ", nr_marchas=" + nr_marchas 
                + ", marcha_atual=" + marcha_atual + ", tem_cambio_autom=" 
                + tem_cambio_autom + ", volume_combustivel=" + volume_combustivel + '}';
    }

    
    
}
