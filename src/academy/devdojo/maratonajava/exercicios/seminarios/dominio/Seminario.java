package academy.devdojo.maratonajava.exercicios.seminarios.dominio;

public class Seminario {
  private String titulo;
  private Professor[] professores;
  private Aluno[] alunos;
  private Local endereco;

  public Seminario(String titulo, Aluno[] alunos) {
    this.titulo = titulo;
    this.alunos = alunos;
  }
  public Seminario(String titulo) {
    this.titulo = titulo;
  }
  public Seminario() {

  }

  public void imprime() {
    System.out.println("Título do seminário: "+this.titulo);
    if(professores != null) {
      for(Professor prof: professores) {
        System.out.println("Professor: "+prof.getNome());
        System.out.println("Especialidade: "+prof.getEspecialidade());
      }
    }
    System.out.println("Local: "+endereco.getEndereco());
    if(alunos != null) {
      for(Aluno aluno: alunos) {
        System.out.println("Nome do aluno: "+aluno.getNome());
      }
    }
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getTitulo() {
    return this.titulo;
  }

  public void setProfessores(Professor[] professores) {
    this.professores = professores;
  }
  public Professor[] getProfessores() {
    return this.professores;
  }
  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }
  public Aluno[] getAlunos() {
    return this.alunos;
  }

  public void setEndereco(Local endereco) {
    this.endereco = endereco;
  }
  public Local getEndereco() {
    return this.endereco;
  }
}
