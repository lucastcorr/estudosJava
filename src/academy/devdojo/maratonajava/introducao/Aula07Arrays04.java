package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
  public static void main(String[] args) {
    String[] nomes = new String[3];
    nomes[0] = "Porto Alegre";
    nomes[1] = "Cachoeirinha";
    nomes[2] = "Tapejara";

    for(String nomesEach : nomes){
      System.out.println(nomesEach);
    }
  }
}
