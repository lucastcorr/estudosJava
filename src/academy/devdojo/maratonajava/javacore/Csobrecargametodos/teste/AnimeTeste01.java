package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
  public static void main(String[] args) {
    Anime anime = new Anime();

    anime.init("Aleatorio", "TV", 12);
    /*
      anime.setNome("Aleatorio");
      anime.setTipo("TV");
      anime.setEpisodios(12);
     */
    anime.imprime();
  }
}
