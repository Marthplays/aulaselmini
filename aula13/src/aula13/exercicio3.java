package aula13;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
    static String[] lista = new String[3];
    static String palavraSecreta;
    static char[] letraDescoberta;
    static int erro = 0;
    static char letra;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        //armazenar as palavras secretas
        System.out.println("Digite as palavras:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = in.next().toUpperCase();
        }
        //escolher uma palavra da lista de forma aleatória
        palavraSecreta = lista[rng.nextInt(lista.length)];
        letraDescoberta = new char[palavraSecreta.length()];
        for (int i = 0; i < letraDescoberta.length; i++) {
            letraDescoberta[i] = '_';
        }

        //loop para jogar
        while (erro < 6 && !descobrir()) {
            System.out.print("A palavra e: ");
            for (char caractere : letraDescoberta) {
                System.out.print(caractere + " ");
            }

            System.out.print("\nDigite uma letra: ");
            letra = in.next().toUpperCase().charAt(0);

            if (!verificar()) {
                erro++;
                System.out.println("Voce errou pela " + erro + "ra vez, tente novamente!");
            }
            System.out.println();
        }
    }

    public static boolean descobrir() {
        for (char caractere : letraDescoberta) {
            if (caractere == '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean verificar() {
        boolean achou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (letra == palavraSecreta.charAt(i)) {
                letraDescoberta[i] = letra;
                achou = true;
            }
        }
        return achou;
    }
}

