package academy.devdojo.maratonajava.exercicios.seminarios.dominio;

public class Local {
  private String endereco;

  public Local(String endereco) {
    this.endereco = endereco;
  }
  public Local() {

  }

  public void imprime() {
    System.out.println("Endereço: "+this.endereco);
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public String getEndereco() {
    return this.endereco;
  }
}
