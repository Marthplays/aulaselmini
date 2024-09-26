package aula12;

import java.util.Random;

public class exercicio6 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        int[] maior;

        lerDados(m);
        imprimir(m);
        maior = maiorValor(m);
        imprimir(maior);
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

    public static void imprimir(int[] m) {
        for (int i : m) {
            System.out.print(i + "\n");
        }
    }

    public static int[] maiorValor(int[][] m) {
        int[] maior = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            maior[i] = Integer.MIN_VALUE;
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] > maior[i]) {
                    maior[i] = m[i][j];
                }
            }
        }
        return maior;
    }
}
