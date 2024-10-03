import java.util.Random;
import java.util.Scanner;

public class exercicio02prova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        int cidades, origem, destino, parada, total;

        System.out.println("Digite quantas cidades você deseja ver o tempo do trajeto: ");
        cidades = in.nextInt();

        int[][] tempo = new int[cidades][cidades];

        //preenchimento da matriz tempo
        for (int i = 0; i < cidades - 1; i++) {
            for (int j = 1 + i; j < cidades; j++) {
                tempo[i][j] = rng.nextInt(1,16);
                tempo[j][i] = tempo[i][j];
            }
        }
        //impressão da matriz tempo
        for (int i = 0; i < cidades; i++) {
            for (int j = 0; j < cidades; j++) {
                tempo[j][i] = tempo[i][j];
                System.out.print(tempo[i][j] + "\t");
            }
            System.out.println();
        }
        //item b
        System.out.println("cidade de origem: ");
        origem = in.nextInt();
        System.out.println("cidade de destino: ");
        destino = in.nextInt();
        System.out.println("tempo = " + tempo[origem-1][destino-1]);

        //item c
        System.out.println("cidade de origem: ");
        origem = in.nextInt();
        System.out.println("cidade de destino: ");
        destino = in.nextInt();
        System.out.println("cidade de parada: ");
        parada = in.nextInt();
        total = tempo[origem-1][parada-1] + tempo[parada-1][destino-1];
        System.out.println("tempo = " + total);
    }
}
