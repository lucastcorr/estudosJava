package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
  public static void main(String[] args) {
    int age = 27;
    //int salaryInt = (int) 2500.00;
    //double salaryDouble = 1000000.00;
    //float salaryFloat = 2500.00f;
    byte ageByte = (byte) 10000;
    ////short ageShort = 10;
    //boolean trueBoolean = true;
    //boolean falseBoolean = false;
    //char character = 10;

    //String em Java é uma classe, portando declaramos com letra maiúscula
    String name = "Lucas Tatsch Corrêa Spengler";

    System.out.println("A idade é: "+age);
    System.out.println("Byte 10.000 com casting: "+ageByte);
    System.out.println("Meu nome é "+name);

  }
}
