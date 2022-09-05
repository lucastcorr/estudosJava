package academy.devdojo.maratonajava.exercicios.seminarios.dominio;

public class Professor {
  private String nome;
  private String especialidade;

  public Professor(String nome, String especialidade) {
    this.nome = nome;
    this.especialidade = especialidade;
  }
  public Professor() {

  }

  public void imprime() {
    System.out.println("Nome do professor: "+this.nome);
    System.out.println("Especialidade de "+this.nome+": "+this.especialidade);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }
  public String getEspecialidade() {
    return this.especialidade;
  }
}
