package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();
    double[] salary = new double[3];
    salary[0] = 2200;
    salary[1] = 2500;
    salary[2] = 2750;

    funcionario.setInfo("Lucas Corrêa", 27, salary);
    funcionario.showInfo();
  }
}
