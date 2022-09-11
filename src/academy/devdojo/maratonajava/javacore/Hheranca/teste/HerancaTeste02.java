package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
  // ORDEM DE EXECUÇÃO/COMPILAÇÃO DAS ESTRUTURAS
  // 0 - Execução do bloco estático da super classe quando a JVM carregar a classe pai
  // 1 - Execução do bloco estático da sub-classe quando a JVM carregar a classe filha
  // 2 - Alocação do espaço em memória para o objeto da classe pai
  // 3 - Cada atributo da classe pai é criado e inicializado com os valores default ou pré-estabelecidos
  // 4 - Execução do construtor da super classe quando a JVM carregar a classe pai
  // 5 - Execução

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Jiraya");
    funcionario.imprime();
  }
}
