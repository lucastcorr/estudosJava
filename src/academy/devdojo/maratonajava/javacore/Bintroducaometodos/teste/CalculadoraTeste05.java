package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    int[] numeros = {1, 2, 3, 4, 5};
    // Passagem de argumentos fazendo com que o primeiro elemento 1 seja
    // erroneamente atribuito ao novo parâmetro criado no método
    calculadora.somaNumeros(1, 2, 3, 4, 5);
  }
}
