package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioPrivate {
  private String name;
  private int age;
  private double[] salary = new double[3];
  private double averageSalary;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }

  public void setSalary(double[] salary){
    this.salary = salary;
    setAverageSalary(this.salary);
  }
  public double[] getSalary(){
    return this.salary;
  }

  private void setAverageSalary(double[] salary){
    for(double totalSalary: salary){
      this.averageSalary += totalSalary;
    }
    this.averageSalary = (this.averageSalary / salary.length);
  }
  public double getAverageSalary(){
    return this.averageSalary;
  }
}
