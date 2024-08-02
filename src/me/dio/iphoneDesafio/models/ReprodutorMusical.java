package me.dio.iphoneDesafio.models;

import me.dio.iphoneDesafio.interfaces.IIphone;

public class ReprodutorMusical implements IIphone {
    @Override
    public void iniciar() {

        var nomeAplicativo = descobrirNomeClasse();
        System.out.println("Iniciando: " + nomeAplicativo);
    }

    @Override
    public void desligar(String aplicativo) {
        String nomeAplicativo = aplicativo;
        System.out.println("Desligando: " + nomeAplicativo);
    }

    @Override
    public String descobrirNomeClasse() {
        String primeiroNomeAplicativo = getClass().getSimpleName().substring(0, 10);
        String segundoNomeAplicativo = getClass().getSimpleName().substring(10);
        String nomeAplicativo = String.join(" ", primeiroNomeAplicativo, segundoNomeAplicativo);
        return nomeAplicativo;
    }

    public void tocar() {
        System.out.println("Tocando musica!");
    }

    public void pausar() {
        System.out.println("Pausando musica!");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Tocando musica: " + musica);
    }


}
