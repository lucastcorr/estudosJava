package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

/*
  AULA 65 NOTION
 */

public class JogadorTeste02 {
  public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Pelé");
    Time time = new Time("Seleção Brasileira");

    jogador1.setTime(time);
    jogador1.imprime();
  }
}
