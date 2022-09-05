package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste {
  public static void main(String[] args) {
    Anime anime = new Anime("DBZ", 25);

    System.out.println("Nome do anime: "+anime.getNome());
    for(int ep: anime.getEpisodios()){
      System.out.println(ep);
    }
  }
}
