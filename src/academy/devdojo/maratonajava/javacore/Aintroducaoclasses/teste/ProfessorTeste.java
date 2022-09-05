package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
  public static void main(String[] args) {
    Professor professor = new Professor();

    professor.nome = "Vinicius";
    professor.idade = 35;
    professor.matricula = 12345;
    professor.sexo = 'M';

    System.out.println("Nome: "+professor.nome+". Idade: "+professor.idade+" Matrícula: "+professor.matricula+" Sexo: "+professor.sexo+".");
  }
}
