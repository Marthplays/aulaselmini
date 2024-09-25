import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int dsAcima = 0;
        int[][] x = new int[5][5];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = rng.nextInt(0, 10);
            }
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Numeros:" + x[0][0] + " " + x[0][1] + " " + x[0][1] + " " + x[0][3] + " " + x[1][0] + " " + x[1][1] + " " + x[1][2] + " " + x[2][0] + " " + x[2][1] + " " + x[3][0]);
        System.out.println("Soma dos números acima: " + (x[0][0] + x[0][1] + x[0][1] + x[0][3] + x[1][0] + x[1][1] + x[1][2] + x[2][0] + x[2][1] + x[3][0]));

    }
}
