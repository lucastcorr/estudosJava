package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    int num1 = 1;
    int num2 = 2;

    calculadora.alteraDoisNumeros(num1, num2);
    System.out.println("Fora do método");
    System.out.println("Num1: "+num1);
    System.out.println("Num2: "+num2);
  }
}
