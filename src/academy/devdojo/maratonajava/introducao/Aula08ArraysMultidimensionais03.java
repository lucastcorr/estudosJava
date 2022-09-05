package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais03 {
  public static void main(String[] args) {
    int[][] arrayInt = new int[3][3];

    /*
    Lembrando que em foreach criamos duas variáveis temporárias locais onde a primeira irá receber
    e percorrer a referência do primeiro índice base e a segunda percorrerá o segundo índice.
     */
    // Impressão do array 3x3
    for(int[] arrayBase : arrayInt){
      for(int arraySec : arrayBase){
        System.out.print(arraySec);
      }
      System.out.println();
    }

    // Populando e inicializando automaticamente o array bi com chaves e os valores
    int[][] arrayIntDois = new int[3][];
    arrayIntDois[0] = new int[]{0, 1}; // Compilador identifica os 2 valores e cria 2 índices
    arrayIntDois[1] = new int[]{0, 1, 2}; // Compilador identifica os 3 valores e cria 3 índices
    arrayIntDois[2] = new int[6]; // Aqui apenas inicializamos, sem popular

    for(int[] arrayBase : arrayIntDois){
      for(int arraySec : arrayBase){
        System.out.print(arraySec);
      }
      System.out.println();
    }

    // Inicialização do array conforme exemplo anterior dos dias x meses
    arrayInt[0] = new int[31];
    arrayInt[1] = new int[28];
    arrayInt[2] = new int[31];

    // Impressão do array 3 x 31/28/31
    for(int[] arrayBase : arrayInt){
      for(int arraySec : arrayBase){
        System.out.print(arraySec);
      }
      System.out.println();
    }

    /*
    Declarando um array bidimensional com atribuição direta dos valores onde o compilador já
    fará a identificação dos índices necessários para comportá-los
     */

    int[][] arrayTres = {{0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4, 5, 6}};

    for(int[] arrayBase : arrayTres){
      for(int arraySec : arrayBase){
        System.out.print(arraySec);
      }
      System.out.println();
    }
  }
}
