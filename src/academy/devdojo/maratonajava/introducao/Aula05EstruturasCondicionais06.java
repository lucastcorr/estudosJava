package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
  public static void main(String[] args) {
    // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    // considerando 1 como domingo e 7 como sábado
    byte dia = 1;

    if(dia == 1 || dia == 7){
      System.out.println("Final de semana");
    } else if(dia > 1 && dia < 7){
      System.out.println("Dia de semana");
    } else{
      System.out.println("O valor inserido não está entre 1 e 7");
    }
  }
}
