package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
  public static void main(String[] args) {
    Endereco endereco = new Endereco();
    endereco.setRua("Alberto Silva");
    endereco.setCep("91370-000");

    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Lucas Corrêa");
    pessoa1.setCpf("035671970-70");
    pessoa1.setEndereco(endereco);
    pessoa1.imprime();

    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Victória Farias");
    funcionario.setCpf("000000000-00");
    funcionario.setEndereco(endereco);
    funcionario.setSalario(2800);
    funcionario.imprime();
  }
}
