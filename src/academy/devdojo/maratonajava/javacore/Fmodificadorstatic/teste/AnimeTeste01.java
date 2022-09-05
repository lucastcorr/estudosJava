package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio.Anime;

public class AnimeTeste01 {
  public static void main(String[] args) {
    Anime anime1 = new Anime("DBZ", 10);
    Anime anime2 = new Anime("Cavaleiros do Zodíaco", 15);
    Anime anime3 = new Anime("Naruto", 5);

    anime1.imprime();
    anime2.imprime();
    anime3.imprime();
  }
}
