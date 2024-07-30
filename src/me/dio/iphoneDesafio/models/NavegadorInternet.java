package me.dio.iphoneDesafio.models;

import me.dio.iphoneDesafio.interfaces.IIphone;

public class NavegadorInternet implements IIphone {

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
        String primeiroNomeAplicativo = getClass().getSimpleName().substring(0, 9);
        String segundoNomeAplicativo = getClass().getSimpleName().substring(9);
        String nomeAplicativo = String.join(" ", primeiroNomeAplicativo, segundoNomeAplicativo);
        return nomeAplicativo;
    }

}
