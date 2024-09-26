package aula12;

import java.util.Random;

public class exercicio5 {
    public static void main(String[] args) {
    int x[] = new int[10];
    int y[] = new int[10];
    preencherVetor(x);
    imprimirVetor(x);
    System.out.println();
    inversaoVetor(x);
    imprimirVetor(x);
    }
    public static void preencherVetor(int[] x) {
        Random rng = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rng.nextInt(1,15);
        }
    }
    public static void imprimirVetor(int[] x) {
        for (int i : x) System.out.print(x[i] + " ");
    }
    public static void inversaoVetor(int[] x) {
        int aux;
        for(int i = 0; i < x.length / 2; i++) {
            aux = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = aux;
        }
    }
}
