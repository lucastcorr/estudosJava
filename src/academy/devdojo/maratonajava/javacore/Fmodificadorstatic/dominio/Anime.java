package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Anime {
  private String nome;
  private int[] episodios;

  static {
    System.out.println("Dentro do bloco estático.");
    // episodios = new int[100];
    // System.out.println(episodios.length);
  }

  {
    // Demonstração de execução do bloco de inicialização onde ainda não temos os dados
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

  public Anime(){
    // Criação de um construtor vazio que possibilida a instanciação sem argumentos
  }

  public void imprime() {
    System.out.println("Nome: "+this.nome);
    System.out.println("Episodios: "+this.episodios.length);
  }

  public int[] getEpisodios(){
    return this.episodios;
  }

  public String getNome(){
    return this.nome;
  }
}
