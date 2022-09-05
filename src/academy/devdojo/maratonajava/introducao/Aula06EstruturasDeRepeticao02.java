package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
  public static void main(String[] args) {
    // Imprimir números pares de 0 a 1000000 (1 milhão)

    for(int i = 0; i <= 100; i += 2){
      System.out.println("Apenas com incrememento +=2: "+i);
    }

    for(int j = 1; j <= 100; j++){
      if(j % 2 == 0){
        System.out.println("Com verificação de resto: "+j);
      }
    }
  }
}
