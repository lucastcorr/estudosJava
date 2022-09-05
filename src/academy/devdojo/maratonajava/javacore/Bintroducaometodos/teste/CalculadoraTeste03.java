package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    double resultado;
    resultado = calculadora.divideDoisNumeros(30, 3);
    System.out.println(resultado);
  }
} 
