import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] b = new int[10][10];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = rng.nextInt(10);
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
