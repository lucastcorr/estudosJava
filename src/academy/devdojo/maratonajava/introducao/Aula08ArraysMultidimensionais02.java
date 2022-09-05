package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
  public static void main(String[] args) {
    int[][] dias = new int[3][3];

    for(int i = 0; i < dias.length; i++){
      for(int j = 0; j < dias[i].length; j++){
        dias[i][j] = j + 1;
      }
    }

    for(int[] matriz : dias){
      for(int num : matriz){
        System.out.println(num);
      }
    }
  }
}
