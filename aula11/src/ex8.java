import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] vetorMaiorValor = new int[10];
        int[][] x = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                x[i][j] = rng.nextInt(10);
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetorMaiorValor[i] < x[i][j]) {
                    vetorMaiorValor[i] = x[i][j];
                }
            }
        }
        System.out.println();
        System.out.println();
    }
}
