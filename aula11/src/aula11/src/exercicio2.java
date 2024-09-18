package aula11.src;

import java.util.Random;

public class exercicio2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] x = new int[4][4];
        int maior = 0;
        //entrada de dados
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = rng.nextInt(25);
                System.out.print(x[i][j] + " \t");
                if (x[i][j] > maior) {
                    maior = x[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Maior = " + maior);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i][j] == maior) {
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }
}
