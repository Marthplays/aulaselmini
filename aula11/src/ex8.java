import java.util.Random;

/*Escreva um programa em Java que preencha uma matriz quadrada de ordem 10 com valores
aleatórios. Os elementos de cada linha da matriz deverão ser ordenados em ordem crescente.
Manipule cada linha como um vetor independente dos demais.*/

import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[][] matriz = new int[tamanho][tamanho];
        Random random = new Random();

        // Preenchendo a matriz com valores aleatórios
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = random.nextInt(2); // Valores aleatórios de 0 a 99
            }
        }

        // Exibindo a matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Ordenando cada linha em ordem crescente
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                for (int k = 0; k < tamanho - 1 - j; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }

        // Exibindo a matriz ordenada
        System.out.println("\nMatriz com linhas ordenadas em ordem crescente:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



