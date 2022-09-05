package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    // Propriedades públicas que podem ser acessadas e manipuladas diretamente
    pessoa.name = "Lucas";
    pessoa.age = 27;
    // Métodos para acesso e manipulação da propriedade com modificador private
    pessoa.setCpf("000000000-00");

    System.out.println(pessoa.name);
    System.out.println(pessoa.age);
    System.out.println(pessoa.getCpf());

  }
}
