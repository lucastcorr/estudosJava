package academy.devdojo.maratonajava.exercicios.seminarios.dominio;

public class Professor {
  private String nome;
  private String especialidade;
  private Seminario[] seminarios;

  public Professor(String nome, String especialidade, Seminario[] seminarios) {
    this.nome = nome;
    this.especialidade = especialidade;
    this.seminarios = seminarios;
  }
  public Professor(String nome, String especialidade) {
    this.nome = nome;
    this.especialidade = especialidade;
  }
  public Professor() {

  }

  public void imprime() {
    System.out.println("Nome do professor: "+this.nome);
    System.out.println("Especialidade de "+this.nome+": "+this.especialidade);
    if(seminarios != null) {
      System.out.println("Seminários cadastrados de "+this.nome+": ");
      for(Seminario sem: seminarios) {
        System.out.println(sem.getTitulo());
      }
    }
    System.out.println("------------------------------");
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

  public void setSeminarios(Seminario[] seminarios) {
    this.seminarios = seminarios;
  }
  public Seminario[] getSeminarios() {
    return this.seminarios;
  }
}
