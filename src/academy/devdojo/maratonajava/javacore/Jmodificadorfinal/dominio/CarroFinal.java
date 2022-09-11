package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public /*final*/ class CarroFinal {
  private String nome;
  public static final double VELOCIDADE_LIMITE = 250;
  public final Comprador COMPRADOR = new Comprador();

  public final void imprime() {
    System.out.println("Comprador: "+COMPRADOR.getNome());
    System.out.println("Nome: "+this.nome);
    System.out.println("Velocidade limite: "+Carro.VELOCIDADE_LIMITE);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
