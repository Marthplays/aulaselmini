package aula12;

import java.util.Random;

public class exercicio5 {
    public static void main(String[] args) {
    int x[] = new int[10];
    preencherVetor(x);
    System.out.println(x);
    }
    public static int preencherVetor(int[] x) {
        Random rng = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rng.nextInt(10);
        }
        return 0;
    }
}
