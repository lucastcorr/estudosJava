package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
  private String nome;

  public Professor(String nome) {
    this.nome = nome;
  }
  public Professor() {

  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }
}
