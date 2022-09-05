package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
  public static void main(String[] args) {
    // Lembrando que a declaração da quantidade de índices vai apenas no new String[3]
    String[] nomes = new String[3];
    nomes[0] = "Lucas";
    nomes[1] = "Victória";
    nomes[2] = "Guilherme";

    for(int i = 0; i < 3; i++){
      System.out.println(nomes[i]);
    }
  }
}
