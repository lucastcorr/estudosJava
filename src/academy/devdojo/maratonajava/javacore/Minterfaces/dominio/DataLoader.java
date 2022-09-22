package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
  public static final int MAX_DATA_SIZE = 10;

  void load();

  default void checkPermission() {
    System.out.println("Checando as permissões..");
  }

  public static void showMaxDataSize() {
    System.out.println("MAX_DATA_SIZE dentro da interface DataLoader");
  }
}
