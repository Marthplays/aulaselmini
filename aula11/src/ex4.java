import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] x = new int[2][2];
        int[][] y = new int[2][2];
        int[][] z = new int[2][2];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Valor: ");
                x[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("Valor: ");
                y[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = x[i][j] - y[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.print(z[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
