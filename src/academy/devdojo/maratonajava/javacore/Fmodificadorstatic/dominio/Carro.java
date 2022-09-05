package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Carro {
  private String nome;
  private double velocidadeMaxima;
  public static double velocidadeLimite = 250;

  public Carro(String nome, double velocidadeMaxima){
    this.nome = nome;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public void imprime(){
    System.out.println("--------------------");
    System.out.println("Nome: "+this.nome);
    System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
    /*
    Na linha 20 podemos referenciar o atributo com o uso de this. pois estamos dentro de um método
    que não é estático e será executado quando pelo menos um objeto tiver sido instanciado, o que
    não poderia ser feito no caso de um método estático.
     */
    System.out.println("Velocidade limite: "+this.velocidadeLimite);
    System.out.println("--------------------");
  }

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  public void setValocidadeMaxima(double velocidadeMaxima){
    this.velocidadeMaxima = velocidadeMaxima;
  }
  public double getVelocidadeMaxima(){
    return this.velocidadeMaxima;
  }

  public void setVelocidadeLimite(double velocidadeLimite){
    this.velocidadeLimite = velocidadeLimite;
  }
  public double getVelocidadeLimite(){
    return this.velocidadeLimite;
  }
}
