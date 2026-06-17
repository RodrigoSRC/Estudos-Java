package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Time time = new Time("Brasil");
        jogador2.setTime(time);
        jogador.setTime(time);
        Jogador jogadores[] = { jogador, jogador2 };
        time.setJogadores(jogadores);

        System.out.println("Jogador: ");
        jogador.imprime();
        System.out.println("Jogador 2: ");
        jogador2.imprime();
        System.out.println("Time: ");
        time.imprime();
    }
}
