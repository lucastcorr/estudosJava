package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTeste01 {
  public static void main(String[] args) {
    Carro carro1 = new Carro("VW", 270);
    Carro carro2 = new Carro("Mercedes", 240);
    Carro carro3 = new Carro("BMW", 340);

    carro1.imprime();
    carro2.imprime();
    carro3.imprime();

    Carro.velocidadeLimite = 180;

    carro1.imprime();
    carro2.imprime();
    carro3.imprime();
  }
}
