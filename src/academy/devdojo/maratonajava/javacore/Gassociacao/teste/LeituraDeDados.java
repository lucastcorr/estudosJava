package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDeDados {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int idade;
    String nome;
    char sexo;

    System.out.print("Digite seu nome: ");
    nome = input.nextLine();
    System.out.print("Sua idade: ");
    idade = input.nextInt();
    System.out.print("Seu sexo [m/f]: ");
    sexo = input.next().charAt(0);

    System.out.println("Nome: "+nome);
    System.out.println("Idade de "+nome+": "+idade);
    System.out.println("Sexo de "+nome+": "+sexo);
  }
}
