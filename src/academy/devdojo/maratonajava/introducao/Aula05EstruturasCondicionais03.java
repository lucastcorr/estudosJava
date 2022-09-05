package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
  public static void main(String[] args) {
    int idade = 27;
    String mensagem = "";

    mensagem = (idade >= 18) ? "É maior de idade!" : "É menor de idade!";

    System.out.println(mensagem);
  }
}
