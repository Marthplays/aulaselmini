import java.util.Random;
import java.util.Scanner;

public class exercicio01prova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        int ordem;

        System.out.println("Ordem da matriz: ");
        ordem = in.nextInt();

        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = rng.nextInt(1,10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = ordem - 1; i >= 0; i--) {
            for (int j = ordem - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
