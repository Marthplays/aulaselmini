package aula13;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira a quantidade de palavras que deseja conferir:");
        int qntPalavras = in.nextInt();

        String palavra;
        String[] palavras = new String[qntPalavras];

        for (int i = 0; i < qntPalavras; i++) {
            System.out.println("Digite as palavras:");
            palavras[i] = in.next();
        }

        lerPalavras(palavras);
        localizarPar(palavras);
    }

    public static void lerPalavras(String[] palavras) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("--->");
            palavras[i] = in.next();
        }
    }

    public static void localizarPar(String[] palavras) {
        String invertida;
        for (String palavra : palavras) {
            invertida = inverterPalavra(palavra);
        }
    }

    public static String inverterPalavra(String palavra) {
        char[] letra = new char[palavra.length()];
        for (int i = palavra.length() - 1; i >= 0; i--) {
            letra[palavra.length() - 1 - i] = palavra.charAt(i);
        }
        return new String(letra);
    }
}
