package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
  /*
    * Utilizando a classe especial enum, não precisamos declarar os tipos dos dados
    que estamos criando (modificador de acesso, tipo etc) pois o nome da classe é
    o próprio tipo dos atributos PESSOA_FISICA e PESSOA_JURIDICA.
    * Esses atributos se comportam como CONSTANTES estáticas e final.
   */

  PESSOA_FISICA(1, "Pessoa física"),
  PESSOA_JURIDICA(2, "Pessoa jurídica");

  private int valor;
  private String nomeRelatorio;

  private TipoCliente(int valor, String nomeRelatorio) {
    this.valor = valor;
    this.nomeRelatorio = nomeRelatorio;
  }

  public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
    for(TipoCliente tipoCliente: values()) {
      if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
        return tipoCliente;
      }
    }
    return null;
  }

  public int getValor() {
    return this.valor;
  }

  public String getNomeRelatorio() {
    return nomeRelatorio;
  }
}
