package academy.devdojo.maratonajava.exercicios.seminarios.teste;

import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Aluno;
import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Local;
import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Professor;
import academy.devdojo.maratonajava.exercicios.seminarios.dominio.Seminario;

public class SeminarioTeste01 {
  public static void main(String[] args) {
    // Instânciação do Objeto seminário1
    Seminario seminario1 = new Seminario("Segurança da informação");
    Seminario seminario2 = new Seminario("Linguagens e seus Paradigmas");
    Seminario[] seminarios = new Seminario[]{seminario1, seminario2};

    // Instanciação do Objeto professor1 e criação do vetor professores
    Professor professor1 = new Professor("Elliot Alderson", "Engenheiro de segurança");
    Professor professor2 = new Professor("Adriana Neves", "Educadora e Doutoranda");
    Professor[] professores = new Professor[]{professor1, professor2};

    // Instanciação do Objeto local
    Local local1 = new Local("Califórnia");
    Local local2 = new Local("Uniritter");

    // Instanciação dos Objetos aluno1 e aluno2 e criação do vetor alunos
    Aluno aluno1 = new Aluno("Lucas Corrêa", 27);
    Aluno aluno2 = new Aluno("Victória Farias", 26);
    Aluno aluno3 = new Aluno("Guilherme Pacheco", 16);
    Aluno[] alunos = new Aluno[]{aluno1, aluno2};
    Aluno[] alunos2 = new Aluno[]{aluno3};

    // Criação das relações entre Objeto seminario1, vetor professores, objeto local e vetor alunos
    seminario1.setProfessores(professores);
    seminario1.setEndereco(local1);
    seminario1.setAlunos(alunos);

    seminario2.setProfessores(professores);
    seminario2.setEndereco(local2);
    seminario2.setAlunos(alunos2);

    // Criação da relação entre professor1 e seminario1
    professor1.setSeminarios(seminarios);
    professor1.imprime();

    professor2.setSeminarios(seminarios);
    professor2.imprime();

    seminario1.imprime();
    seminario2.imprime();
  }
}
