package aula11.src;

import java.util.Random;

public class exercicio5 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] x = new int[2][3];
        //entrada de dados
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = rng.nextInt(10);
            }
        }
        //impressao no formato de tabela
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //impressao transposta
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(x[j][i] + "\t");
            }
            System.out.println();
        }
    }
}

