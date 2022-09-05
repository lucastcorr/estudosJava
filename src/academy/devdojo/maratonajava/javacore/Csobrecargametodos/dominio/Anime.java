package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

import java.sql.SQLOutput;

public class Anime {
  /*
  Aqui temos uma mudança de requisitos onde nosso hipotético chefe nos solicita a criação de
  um novo atributo para definirmos o NOME do anime:
  */
  private String nome;
  private String tipo;
  private int episodios;

  public void init(String nome, String tipo, int episodios){
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
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
