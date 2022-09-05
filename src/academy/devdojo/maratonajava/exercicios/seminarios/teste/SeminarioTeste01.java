package academy.devdojo.maratonajava.exercicios.seminarios.teste;

import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Aluno;
import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Local;
import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Professor;
import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Seminario;

public class SeminarioTeste01 {
  public static void main(String[] args) {
    Seminario seminario1 = new Seminario("Segurança da informação");
    Professor professor1 = new Professor("Elliot Alderson", "Engenheiro de segurança");
    Professor[] professores = new Professor[]{professor1};
    Local local = new Local("Califórnia");
    Aluno aluno1 = new Aluno("Lucas Corrêa", 27);
    Aluno aluno2 = new Aluno("Victória Farias", 26);
    Aluno[] alunos = new Aluno[]{aluno1, aluno2};

    seminario1.setProfessores(professores);
    seminario1.setEndereco(local);
    seminario1.setAlunos(alunos);

    seminario1.imprime();
  }
}
