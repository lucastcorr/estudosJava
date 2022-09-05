package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
  public static void main(String[] args) {
    // + - / *
    int num1 = 10;
    int num2 = 20;
    float res = num1 / num2;
    float res2 = (float) num1 / num2;
    System.out.println("Subtração "+(num2 - num1));
    System.out.println("Soma "+(num2 + num1));
    System.out.println("Divisão "+(num2 / num1));
    System.out.println("Multiplicação "+(num2 * num1));
    System.out.println("Divisão para float sem casting "+res);
    System.out.println("Divisão para float com casting "+res2);

    // %
    int resto = 20 % 2;
    System.out.println(resto);

    // > < >= <= == !=
    boolean isDezMaiorQueVinte = 10 > 20;
    System.out.println("isDezMaiorQueVinte? "+isDezMaiorQueVinte);

    boolean isDezMenorQueVinte = 10 < 20;
    System.out.println("isDezMenorQueVinte? "+isDezMenorQueVinte);

    boolean isDezIgualADez = 10 == 10;
    System.out.println("isDezIgualADez? "+isDezIgualADez);

    boolean isCincoDiferenteDeDez = 5 != 10;
    System.out.println("isCincoDiferenteDeDez? "+isCincoDiferenteDeDez);

    // %% (AND) || (OR) ! (NOT)
    int age = 29;
    float salary = 3500F;
    boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && salary >= 4612;
    System.out.println("isDentroDaLeiMaiorQueTrinta? "+isDentroDaLeiMaiorQueTrinta);

    boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;
    System.out.println("isDentroDaLeiMenorQueTrinta? "+isDentroDaLeiMenorQueTrinta);


    double contaCorrente = 2000D;
    double limiteCartao = 10000D;

    boolean isPlaystation5Buyable = contaCorrente >= 5000 || limiteCartao >= 5000;
    System.out.println("isPlaystation5Buyable? "+isPlaystation5Buyable);

    double bonus = 1800D;
    bonus += 1000;
    System.out.println(bonus);

    double desconto = 300D;
    bonus -= desconto;
    System.out.println(bonus);
  }
}
