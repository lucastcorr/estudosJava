package academy.devdojo.maratonajava.introducao;

public class Aula06ExercicioTaxNetherlands {
  public static void main(String[] args) {
    double anualSalary = 40000D;
    double taxA = 0.097;
    double taxB = 0.3735;
    double taxC = 0.4950;

    if(anualSalary < 34712){
      System.out.println("Anual salary: "+anualSalary);
      System.out.println("Taxes (taxA): %"+taxA);
      System.out.println("Discount tax: "+(anualSalary * taxA));
      System.out.println("Real salary "+(anualSalary -(anualSalary * taxA)));
    } else if(anualSalary >= 34712 && anualSalary < 68507){
      System.out.println("Anual salary: "+anualSalary);
      System.out.println("Taxes (taxB): %"+taxA);
      System.out.println("Discount tax: "+(anualSalary * taxB));
      System.out.println("Real salary "+(anualSalary -(anualSalary * taxB)));
    } else{
      System.out.println("Anual salary: "+anualSalary);
      System.out.println("Taxes (taxC): %"+taxA);
      System.out.println("Discount tax: "+(anualSalary * taxC));
      System.out.println("Real salary "+(anualSalary -(anualSalary * taxC)));
    }
  }
}
