package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
  protected String nome;
  protected String cpf;
  protected Endereco endereco;

  static {
    System.out.println("Dentro do bloco de inicialização estático Pessoa");
  }

  {
    System.out.println("Dentro do bloco de inicializaçãp não-estático 1 Pessoa");
  }

  {
    System.out.println("Dentro do bloco de inicializaçãp não-estático 2 Pessoa");
  }

  // Criação e sobrecarga de construtores
  public Pessoa(String nome, String cpf, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
  }
  public Pessoa(String nome) {
    this.nome = nome;
  }
  public Pessoa() {
    System.out.println("Dentro do construtor de Pessoa");

  }

  public void imprime() {
    System.out.println("PESSOA:");
    System.out.println("Nome: "+this.nome);
    System.out.println("CPF: "+this.cpf);
    if(endereco != null) {
      System.out.println("ENDEREÇO:");
      System.out.println("Rua: "+endereco.getRua());
      System.out.println("CEP: "+endereco.getCep());
    }
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
