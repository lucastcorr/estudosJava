package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
  public String name;
  public int age;
  private String cpf;

  public void setCpf(String cpf){
    if(cpf.length() != 12){
      System.out.println("CPF inválido!");
      return;
    }
    this.cpf = cpf;
  }

  public String getCpf(){
    if(this.cpf == null){
      return "CPF não registrado!";
    }
      return this.cpf;
  }
}
