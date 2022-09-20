package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
  @Override
  public void load() {
    System.out.println("Carregando dados do Banco de Dados");
  }

  @Override
  public void remove() {
    System.out.println("Removendo dados do Banco de Dados");
  }

  @Override
  public void checkPermission() {
    System.out.println("Chegando permissões no DatabaseLoader...");
  }
}
