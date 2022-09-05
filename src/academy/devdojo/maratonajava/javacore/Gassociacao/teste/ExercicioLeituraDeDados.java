package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class ExercicioLeituraDeDados {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String pergunta;

    System.out.print("Digite sua pergunta: ");
    pergunta = input.nextLine();
    if(pergunta.charAt(0) == ' ') {
      System.out.println("SIM!");
    } else {
      System.out.println("NÃO!");
    }
  }
}
