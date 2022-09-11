package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
  private double salario;

  static {
    System.out.println("Dentro do bloco de inicialização estático Funcionario");
  }

  {
    System.out.println("Dentro do bloco de inicializaçãp não-estático 1 Funcionario");
  }

  {
    System.out.println("Dentro do bloco de inicializaçãp não-estático 2 Funcionario");
  }

  // Criação e sobrecarga de construtores conforme super classe
  public Funcionario(String nome, String cpf, Endereco endereco, double salario){
    // sintaxe: super(mesmo contrato do construtor original)
    super(nome, cpf, endereco);
    this.salario = salario;
  }
  public Funcionario(String nome) {
    this.nome = nome;
    System.out.println("Dentro do construtor de funcionário");
  }
  public Funcionario() {

  }

  public void imprime() {
    super.imprime();
    System.out.println("Salário: "+this.salario);
    System.out.println("Uso de nome com protected: "+this.nome);
    System.out.println("Uso de cpf com protected: "+this.cpf);
    //System.out.println("Uso de endereço com protected: "+this.endereco.getRua());
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
