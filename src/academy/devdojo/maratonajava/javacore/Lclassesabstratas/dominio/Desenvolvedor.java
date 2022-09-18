package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario {
  public Desenvolvedor(String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public String toString() {
    return "Desenvolvedor{" +
        "nome='" + nome + '\'' +
        ", salario=" + salario +
        '}';
  }

  @Override
  public void calculaBonus() {
    // Bônus de 5%
    this.salario += this.salario * 0.05;
  }
}
