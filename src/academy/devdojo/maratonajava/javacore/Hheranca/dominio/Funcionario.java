package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
  private double salario;

  public void imprime() {
    super.imprime();
    System.out.println("Salário: "+this.salario);
    System.out.println("Uso de nome com protected: "+this.nome);
    System.out.println("Uso de cpf com protected: "+this.cpf);
    System.out.println("Uso de endereço com protected: "+this.endereco.getRua());
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
