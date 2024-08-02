package me.dio.iphoneDesafio.models;

import me.dio.iphoneDesafio.interfaces.IIphone;

public class AparelhoTelefonico implements IIphone {
    @Override
    public void iniciar() {

        String nomeAplicativo = descobrirNomeClasse();
        System.out.println("Iniciando: " + nomeAplicativo);
    }

    @Override
    public void desligar(String aplicativo) {
        String nomeAplicativo = aplicativo;
        System.out.println("Desligando: " + nomeAplicativo);
    }


    @Override
    public String descobrirNomeClasse() {
        String primeiroNomeAplicativo = getClass().getSimpleName().substring(0, 8);
        String segundoNomeAplicativo = getClass().getSimpleName().substring(8);
        String nomeAplicativo = String.join(" ", primeiroNomeAplicativo, segundoNomeAplicativo);
        return nomeAplicativo;
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada telefonica");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
