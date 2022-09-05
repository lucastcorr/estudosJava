package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
  public static void main(String[] args) {
    int count = 1;

    while(count <= 10){
      System.out.println("While: "+count);
      // Utilização do pós-incremento para evitar um looping infinito da estrutura
      count++;
    }

    count = 1;
    do{
      System.out.println("Do While: "+count);
      count ++;
    } while(count <= 10);

    for(int i = 1; i <= 10; i++){
      System.out.println("For: "+i);
    }
  }
}
