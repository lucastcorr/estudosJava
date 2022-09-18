package academy.devdojo.maratonajava.javacore.Kenum.teste;


import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    Cliente cliente2 = new Cliente("Victória", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
    Cliente cliente3 = new Cliente("Guilherme", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
    Cliente cliente4 = new Cliente("Vilma", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

    System.out.println(cliente1);
    System.out.println(cliente2);
    System.out.println(cliente3);
    System.out.println(cliente4);

    System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

    TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa física");
    System.out.println(tipoCliente);

  }
}
