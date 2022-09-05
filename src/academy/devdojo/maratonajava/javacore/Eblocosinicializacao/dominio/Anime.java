package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
  private String nome;
  private int[] episodios;

  {
    System.out.println("-------------------------------------");
    System.out.println("Dentro do bloco de inicialização");
    System.out.println("Nome: "+this.nome);
    System.out.println("Episodios: "+this.episodios);
    System.out.println("-------------------------------------");
  }

  public Anime(String nome, int episodios){
    this.nome = nome;
    this.episodios = new int[episodios];

    for(int i = 0; i < this.episodios.length; i++){
      this.episodios[i] = i + 1;
    }
  }

  public int[] getEpisodios(){
    return this.episodios;
  }

  public String getNome(){
    return this.nome;
  }
}
