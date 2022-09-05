package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
  public String name;
  public int age;
  public double[] salary = new double[3];

  public void setInfo(String n, int a, double[] s){
    this.name = n;
    this.age = a;
    this.salary = s;
  }

  public void showInfo(){
    /*
    Aqui inicialmente pensei em criar a variável contadora para ir incrementando conforme
    os loops e consequentemente a quantidade de salários inseridos, porém é mais prático
    utilizarmos a função length do array.
    int count = 0;
     */

    double averageSalary = 0;
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);

    //Caso os salários não sejam fornecidos, precisamos preparar o sistema para não falhar
    if(salary != null){
      for(double sal: salary){
        System.out.println(sal);
        averageSalary += sal;
        //count++;
      }
      //averageSalary = (averageSalary / count);
      averageSalary = (averageSalary / salary.length);
    }

    System.out.println("Average salary: "+averageSalary);
  }
}
