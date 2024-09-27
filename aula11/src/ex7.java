import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] x = new int[5][5];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.println("Valor: ");
                x[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

