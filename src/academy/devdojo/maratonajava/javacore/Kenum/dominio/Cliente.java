package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

  private String nome;
  private TipoCliente tipoCliente;
  private TipoPagamento tipoPagamento;

  public Cliente(String nome,
                 TipoCliente tipoCliente,
                 TipoPagamento tipoPagamento) {
    this.nome = nome;
    this.tipoCliente = tipoCliente;
    this.tipoPagamento = tipoPagamento;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "nome='" + nome + '\'' +
        ", tipoCliente=" + tipoCliente +
        ", tipoPagamento=" + tipoPagamento +
        '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TipoCliente getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(TipoCliente tipoCliente) {
    this.tipoCliente = tipoCliente;
  }

  /*
    ALTERNATIVA SEM UTILIZAR ENUM, POUCO PRÁTICA
    private String tipo;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    public Cliente(String nome, String tipo) {
      if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
        return;
      }
      this.nome = nome;
      this.tipo = tipo;
    }

    @Override
    public String toString() {
      return "Cliente{" +
          "nome='" + nome + '\'' +
          ", tipo='" + tipo + '\'' +
          '}';
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getTipo() {
      return tipo;
    }

    public void setTipo(String tipo) {
      this.tipo = tipo;
    }
   */

}
