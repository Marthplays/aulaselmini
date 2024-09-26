package aula12;

import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {
        int x[] = new int[10];
        double media, desvio;
        preencherVetor(x);
        imprimir(x);
        media = pegarMedia(x);
        System.out.println();
        System.out.println("A média = " + media);
        desvio = pegarDesvio(x,media);
        System.out.println("O desvio padrão = " + desvio);
    }

    public static void preencherVetor(int[] x) {
        Random rng = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rng.nextInt(0, 101);
        }
    }

    public static void imprimir(int[] x) {
        for (int i : x) {
            System.out.print(i + " ");
        }
    }

    public static double pegarMedia(int[] x) {
        double soma = 0;
        for(int i : x) {
            soma += i;
        }
        return soma / x.length;
    }

    public static double pegarDesvio(int[] x, double media) {
        double total = 0;
        for (int i : x) {
            total += Math.pow(i-media, 2);
        }
        return  Math.sqrt(total / (x.length-1));
    }
}
