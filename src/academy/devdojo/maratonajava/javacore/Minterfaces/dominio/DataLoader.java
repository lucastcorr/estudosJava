package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
  void load();
  default void checkPermission() {
    System.out.println("Checando as permissões..");
  }
}
