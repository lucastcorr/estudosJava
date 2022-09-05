package academy.devdojo.maratonajava.exercicios.seminarios.dominio;

public class Aluno {
  private String nome;
  private int idade;
  private Seminario seminario;

  public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
  public Aluno(String nome) {
    this.nome = nome;
  }
  public Aluno() {

  }

  public void imprime() {
    System.out.println("Nome do aluno: "+this.nome);
    if(this.idade != 0) {
      System.out.println("Idade de "+this.nome+": "+this.idade);
    }
    if(seminario != null) {
      System.out.println("Título do seminário: "+seminario.getTitulo());
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
  public int getIdade() {
    return this.idade;
  }

  public void setSeminario(Seminario seminario) {
    if(this.seminario != null) {
      System.out.println("O aluno "+this.nome+" já está cadastrado em outro seminário: "+this.seminario);
    } else {
      this.seminario = seminario;
    }
  }
  public Seminario getSeminario() {
    return this.seminario;
  }
}
