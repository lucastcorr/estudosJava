package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
  public static void main(String[] args) {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // A condição é de que a parcela deve ser >= 1.000
    double vehiclePrice = 26000;

    for(double i = 1; i < vehiclePrice; i += 1){
      double fraction = vehiclePrice / i;
      if(fraction < 1000){
        break;
      } else{
        System.out.println("Valor da parcela "+i+": "+fraction);
      }
    }

  }
}
