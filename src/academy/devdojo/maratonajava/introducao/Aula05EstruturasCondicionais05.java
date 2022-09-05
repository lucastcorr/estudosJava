package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
  public static void main(String[] args) {
    // Imprimir os dias da semana considerando 1 como Domingo
    byte dia = 5;

    switch(dia){
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda-Feira");
        break;
      case 3:
        System.out.println("Terça-Feira");
        break;
      case 4:
        System.out.println("Quarta-Feira");
        break;
      case 5:
        System.out.println("Quinta-Feira");
        break;
      case 6:
        System.out.println("Sexta-Feira");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia inválido!");
        break;
    }

    char sexo = 'm';

    switch(sexo){
      case 'm':
        System.out.println("Masculino");
        break;
      case 'f':
        System.out.println("Feminino");
        break;
      default:
        System.out.println("Entrada inválida!");
        break;
    }
  }
}
