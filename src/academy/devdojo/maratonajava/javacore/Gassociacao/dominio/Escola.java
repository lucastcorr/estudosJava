package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
  private String nome;
  private Professor[] professores;

  public Escola(String nome) {
    this.nome = nome;
  }
  public Escola() {

  }

  public void imprime() {
    System.out.println("Nome da escola: "+this.nome);
    if(professores != null) {
      for(Professor prof: professores) {
        System.out.println("Nome do professor: "+prof.getNome());
      }
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }

  public void setProfessores(Professor[] professores){
    this.professores = professores;
  }
  public Professor[] getProfessores() {
    return this.professores;
  }
}
