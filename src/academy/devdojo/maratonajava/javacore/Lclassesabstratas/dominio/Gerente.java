package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
  public Gerente(String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public String toString() {
    return "Gerente{" +
        "nome='" + nome + '\'' +
        ", salario=" + salario +
        '}';
  }

  @Override
  public void calculaBonus() {
    // Bônus de 10%
    this.salario += this.salario * 0.1;
  }
}
