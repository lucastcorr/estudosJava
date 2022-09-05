package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

  public void somaDoisNumeros(){
    System.out.println(10 + 10);
  }

  public void multiplicaDoisNumeros(double a, double b){
    System.out.println(a * b);
  }

  public double divideDoisNumeros(double a, double b){
    return a / b;
  }

  public void alteraDoisNumeros(int num1, int num2){
    num1 = 99;
    num2 = 33;
    System.out.println("Dentro do alteraDoisNumeros");
    System.out.println("Num1: "+num1);
    System.out.println("Num2: "+num2);
  }

  public void somaNumeros(int numQualquer, int... numeros){
    int soma = 0;
    for(int num : numeros){
      soma += num;
    }
    System.out.println(soma);
  }
}
