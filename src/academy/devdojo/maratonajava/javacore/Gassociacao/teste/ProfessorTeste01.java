package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

/*
  AULA 66 NOTION
 */

public class ProfessorTeste01 {
  public static void main(String[] args) {
    Escola escola = new Escola("Universitário");
    Professor professor1 = new Professor("Felipe");
    Professor professor2 = new Professor("Marcelão");
    Professor professor3 = new Professor("Mega");
    Professor[] professores = new Professor[]{professor1, professor2, professor3};
    escola.setProfessores(professores);

    escola.imprime();
  }
}
