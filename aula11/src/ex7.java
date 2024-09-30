import java.util.Scanner;

/*Escreva um programa em Java que preencha uma matriz quadrada de ordem 5 com valores
inteiros fornecidos pelo usuário. Verifique se a matriz é ou não uma matriz triangular superior.
Matriz triangular superior é uma matriz onde todos os elementos de posição L < C são diferentes
de 0 e todos os elementos de posição L > C são iguais a 0. L e C representam respectivamente
linha e coluna da matriz.*/

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
        System.out.println();
        for (int i = 0; i < x.length; i++) {

        }

    }
}

