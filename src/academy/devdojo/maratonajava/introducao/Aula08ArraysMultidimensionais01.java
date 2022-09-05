package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
  public static void main(String[] args) {
    // Criar um array para os meses e "outro" para os dias desses meses
    // Jan 31, Fev 28, Mar 31, Abr 30
    int[][] mesesDias = new int[4][3];

/* // Tentativa de popular a matriz
    for(int i = 0; i < 31; i++){
      mesesDias[0][i] = i + 1;
    }

    for(int i = 0; i < 28; i++){
      mesesDias[1][i] = i + 1;
    }

    for(int i = 0; i < 31; i++){
      mesesDias[2][i] = i + 1;
    }

    for(int i = 0; i < 30; i++){
      mesesDias[3][i] = i + 1;
    }
*/

    mesesDias[0][0] = 1;
    mesesDias[0][1] = 2;
    mesesDias[0][2] = 3;

    mesesDias[1][0] = 1;
    mesesDias[1][1] = 2;
    mesesDias[1][2] = 3;

    mesesDias[2][0] = 1;
    mesesDias[2][1] = 2;
    mesesDias[2][2] = 3;

    mesesDias[3][0] = 1;
    mesesDias[3][1] = 2;
    mesesDias[3][2] = 3;


    for(int i = 0; i < mesesDias.length; i++){
      for(int j = 0; j < mesesDias[i].length; j++){
        System.out.println(mesesDias[i][j]);
      }
    }
  }
}
