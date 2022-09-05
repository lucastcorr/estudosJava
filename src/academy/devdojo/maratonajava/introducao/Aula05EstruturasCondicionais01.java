package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
  public static void main(String[] args) {
    int idade = 27;

    if (idade >= 18) {
      System.out.println("Maior de idade");
    } else {
      System.out.println("Menor de idade");
    }

    int anosExperiencia = 2;
    boolean isDevJunior = anosExperiencia <= 2;

    if (isDevJunior) {
      System.out.println("É desenvolvedor Júnior");
    }
    if (!isDevJunior) {
      System.out.println("Não é desenvolvedor Júnior");
    }
  }
}
