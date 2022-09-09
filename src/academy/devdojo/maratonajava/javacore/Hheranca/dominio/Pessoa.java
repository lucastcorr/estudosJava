package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
  protected String nome;
  protected String cpf;
  protected Endereco endereco;

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
