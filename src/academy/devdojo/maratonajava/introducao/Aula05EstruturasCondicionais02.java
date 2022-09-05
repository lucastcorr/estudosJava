package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
  public static void main(String[] args) {
    // idade < 15: imprimir categoria infantil
    // idade >= 15 && idade < 18: imprimir categoria juvenil
    // idade >= 18: imprimir categoria adulto

    // Versão com comparação direta
    int idade = 19;

    if(idade < 15){
      System.out.println("Categoria infantil");
    } else if(idade >= 15 && idade < 18){
      System.out.println("Categoria juvenil");
    } else{
      System.out.println("Categoria adulto");
    }

    // Versão com variáveis booleanas
    boolean isInfantil = idade < 15;
    boolean isJuvenil = idade >= 15 && idade < 18;
    boolean isAdulto = idade > 18;

    if(isInfantil){
      System.out.println("Categoria infantil");
    } else if(isJuvenil){
      System.out.println("Categoria juvenil");
    } else if(isAdulto){
      System.out.println("Categoria adulto");
    }
  }
}
