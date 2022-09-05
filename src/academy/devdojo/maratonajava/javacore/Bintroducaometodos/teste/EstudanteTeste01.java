package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
  public static void main(String[] args) {
    Estudante estudante01 = new Estudante();
    Estudante estudante02 = new Estudante();
    ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

    estudante01.nome = "Lucas";
    estudante01.idade = 27;
    estudante01.sexo = 'M';

    estudante02.nome = "Victória";
    estudante02.idade = 26;
    estudante02.sexo = 'F';

    estudante01.imprime();
    estudante02.imprime();

    // Chamada do método imprime da aula 49/50
    // impressoraEstudante.imprime(estudante01);
    // impressoraEstudante.imprime(estudante02);

    /*
    Impressão feita primeiramente dentro da classe principal

    System.out.println(estudante01.nome);
    System.out.println(estudante01.idade);
    System.out.println(estudante01.sexo);
    System.out.println("-----------------------------");
    System.out.println(estudante02.nome);
    System.out.println(estudante02.idade);
    System.out.println(estudante02.sexo);
     */
  }
}
