package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();

    carro1.nome = "Fusca";
    carro1.marca = "Volkswagen";
    carro1.ano = 1969;

    carro2.nome = "Supra";
    carro2.marca = "Toyota";
    carro2.ano = 2000;

    System.out.println("Carro 1 nome: "+carro1.nome);
    System.out.println("Carro 1 marca: "+carro1.marca);
    System.out.println("Carro 1 ano: "+carro1.ano);

    System.out.println("Carro 2 nome: "+carro2.nome);
    System.out.println("Carro 2 marca: "+carro2.marca);
    System.out.println("Carro 2 ano: "+carro2.ano);
  }
}
