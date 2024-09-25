package aula12;

import java.util.Random;

public class exercicio6 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        lerDados(m);
        imprimir(m);
    }
    public static void lerDados(int[][] m) {
        Random rng = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rng.nextInt(10);
            }
        }
    }
    public static void imprimir(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
