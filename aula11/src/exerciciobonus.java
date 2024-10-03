import java.util.Random;
import java.util.Scanner;

public class exerciciobonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ordem, total;
        double media;
        String letra;

        System.out.println("Ordem da matriz: ");
        ordem = in.nextInt();

        int[][] matriz = new int[ordem][ordem];

        lerDados(matriz);
        imprimir(matriz);
        System.out.println("Digite S para soma ou M para média");
        letra = in.next();
        if (letra.equalsIgnoreCase("S")) {
            soma(matriz);
        } else if () {

        }
    }
    public static void lerDados(int[][] matriz) {
        Random rng = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rng.nextInt(1,10);
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        Random rng = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int soma(int[][] matriz) {
        int total = 0;

        for (int i = 0; i < (matriz.length - 1) / 2; i++) {
            for (int j = 1 + i; j < matriz.length - 1 - i; j++) {
                total += matriz[i][j];
            }
        }

        return total;

    }
}
