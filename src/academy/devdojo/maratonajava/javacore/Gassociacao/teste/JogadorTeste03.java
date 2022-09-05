package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

/*
  AULA 67 NOTION
 */

public class JogadorTeste03 {
  public static void main(String[] args) {
    Time time = new Time("Seleção Brasileira");
    Jogador jogador1 = new Jogador("Ronaldinho Gaúcho");
    Jogador jogador2 = new Jogador("Ronaldo Nazário");
    Jogador jogador3 = new Jogador("Adriano");
    Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

    for(Jogador jog: jogadores) {
      jog.setTime(time);
    }

    time.setJogadores(jogadores);
    time.imprime();

  }
}
