package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
  private String nome;
  private Jogador[] jogadores;

  public Time(String nome) {
    this.nome = nome;
  }
  public Time(String nome, Jogador[] jogadores) {
    this.nome = nome;
    this.jogadores = jogadores;
  }
  public Time() {

  }

  public void imprime() {
    System.out.println("Nome do time: "+this.nome);
    if(jogadores != null) {
      for(Jogador jog: jogadores) {
        System.out.println("Nome do jogador: "+jog.getNome());
      }
    }
  }

  public void setJogadores(Jogador[] jogadores) {
    this.jogadores = jogadores;
  }
  public Jogador[] getJogadores() {
    return this.jogadores;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }
}
