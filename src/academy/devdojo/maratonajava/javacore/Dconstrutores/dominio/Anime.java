package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
  /*
  Aqui temos uma mudança de requisitos onde nosso hipotético chefe nos solicita a criação de
  um novo atributo para definirmos o NOME do anime:
  */
  private String nome;
  private String tipo;
  private int episodios;
  private String genero;
  private String estudio;

  public Anime(){
    // Construtor padrão caso nenhum parâmetro seja passado
  }

  public Anime(String nome, String tipo, int episodios, String genero){
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
    this.genero = genero;
  }

  public Anime(String nome, String tipo, int episodios, String genero, String estudio){
    this(nome, tipo, episodios, genero);
    this.estudio = estudio;
  }
  public void imprime(){
    System.out.println(this.nome);
    System.out.println(this.tipo);
    System.out.println(this.episodios);
  }

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public String getTipo(){
    return this.tipo;
  }

  public void setEpisodios(int episodios){
    this.episodios = episodios;
  }
  public int getEpisodios(){
    return this.episodios;
  }
}
