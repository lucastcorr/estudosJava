package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste02 {
  public static void main(String[] args) {
    Carro carro = new Carro();
    /*
      AULA 78
      Observação: como a nossa constante VELOCIDADE_LIMITE está declarada como static
      na classe Carro para que o limite de velocidade 250 seja refletido em todos os
      objetos instanciados, para acessa-la devemos referenciar o nome da classe Carro
      e não o identificador carro.
     */
    System.out.println("Velocidade limite: "+Carro.VELOCIDADE_LIMITE);
    carro.COMPRADOR.setNome("Lucas");
    System.out.println("Comprador: "+carro.COMPRADOR);

    /*
      AULA 79
     */
    Ferrari ferrari = new Ferrari();
    System.out.println("--------------------");
    ferrari.COMPRADOR.setNome("Lucas");
    ferrari.setNome("Enzo");
    ferrari.imprime();
  }
}
