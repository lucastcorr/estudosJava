package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class CarroB {
  private String nome;
  private double velocidadeMaxima;
  private static double velocidadeLimite = 250;

  public CarroB(String nome, double velocidadeMaxima) {
    this.nome = nome;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public void imprime() {
    System.out.println("-----------------------------");
    System.out.println("Nome: "+this.nome);
    System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
    System.out.println("Velocidade limite: "+Carro.velocidadeLimite);
  }

  public static void setVelocidadeLimite(double velocidadeLimite) {
    Carro.velocidadeLimite = velocidadeLimite;
  }
  public static double getVelocidadeLimite() {
    return Carro.velocidadeLimite;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }

  public void setVelocidadeMaxima(double velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }
  public double getVelocidadeMaxima() {
    return this.velocidadeMaxima;
  }
}
