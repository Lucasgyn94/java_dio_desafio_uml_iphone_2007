import me.dio.iphoneDesafio.models.AparelhoTelefonico;
import me.dio.iphoneDesafio.models.NavegadorInternet;
import me.dio.iphoneDesafio.models.ReprodutorMusical;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReprodutorMusical mp3 = new ReprodutorMusical();
        mp3.iniciar();
        String reprodutorMusical = "MP3 Player";
        mp3.desligar(reprodutorMusical);

        AparelhoTelefonico tel = new AparelhoTelefonico();
        tel.iniciar();
        String aparelhoTelefonico = "Iphone";
        tel.desligar(aparelhoTelefonico);

        NavegadorInternet nav = new NavegadorInternet();
        nav.iniciar();
        String navegador = "LuChrome";
        nav.desligar(navegador);

    }
}