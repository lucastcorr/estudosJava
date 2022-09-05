package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.dominio.CarroB;

public class CarroBTeste {
  public static void main(String[] args) {
    CarroB carro1 = new CarroB("VW", 240);
    CarroB carro2 = new CarroB("BMW", 340);
    CarroB carro3 = new CarroB("Mercedes", 320);

    carro1.imprime();
    carro2.imprime();
    carro3.imprime();

    CarroB.setVelocidadeLimite(180);

    carro1.imprime();
    carro2.imprime();
    carro3.imprime();
  }

}
