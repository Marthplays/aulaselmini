import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int dsAcima = 0;
        int[][] x = new int[5][5];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = rng.nextInt(0, 50);
                if (i + j == x.length - 2) {
                    dsAcima += x[i][j];
                }
                if (i + j == x.length - 2) {
                    System.out.print( + x[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Soma dos números acima: " + dsAcima);

    }
}
