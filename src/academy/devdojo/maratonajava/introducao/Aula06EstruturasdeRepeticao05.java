package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdeRepeticao05 {
  public static void main(String[] args) {
    double vehiclePrice = 35000D;

    for(int parcela = (int) vehiclePrice; parcela >= 1; parcela --){
      double fraction = vehiclePrice / parcela;
      if(fraction < 1000){
        continue;
      }
      System.out.println("Parcela "+parcela+", valor: "+fraction);
    }
  }
}
