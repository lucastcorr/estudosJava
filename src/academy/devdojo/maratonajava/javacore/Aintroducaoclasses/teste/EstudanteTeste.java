package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste {
  public static void main(String[] args) {
    Estudante estudante = new Estudante();
    estudante.nome = "Lucas";
    estudante.idade = 27;
    estudante.sexo = 'M';

    System.out.println(estudante);
    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);
  }
}
