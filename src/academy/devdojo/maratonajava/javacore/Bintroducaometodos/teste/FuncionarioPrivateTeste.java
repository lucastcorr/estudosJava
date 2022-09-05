package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioPrivate;

public class FuncionarioPrivateTeste {
  public static void main(String[] args) {
    FuncionarioPrivate funcionario = new FuncionarioPrivate();
    double[] salary = {2200, 2500, 2750};

    funcionario.setName("Lucas Corrêa");
    funcionario.setAge(27);
    funcionario.setSalary(salary);

    System.out.println("Name: "+funcionario.getName());
    System.out.println("Age: "+funcionario.getAge());
    for(double sal: funcionario.getSalary()){
      System.out.println("Salary: "+sal);
    }
    System.out.println("Average Salary: "+funcionario.getAverageSalary());

  }
}
