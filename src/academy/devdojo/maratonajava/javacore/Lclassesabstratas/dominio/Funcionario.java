package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
  protected String nome;
  protected double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
    calculaBonus();
  }

  public void imprime(){
    // Poderíamos apenas sobrescreve-la deixando-a vazia ou então utiliza-la
    System.out.println("Testando sobrescrita do método imprime()");
  }

  public abstract void calculaBonus();
}
