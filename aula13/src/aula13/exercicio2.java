package aula13;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra, codificada;
        int rotacao;

        System.out.println("Digite a palavra que deseja criptografar:");
        palavra = in.next();

        System.out.println("Digite qual será a rotação:");
        rotacao = in.nextInt();

        codificada = rotacionarPalavra(palavra, rotacao);

        System.out.println("Palavra codificada: " + codificada);
    }

    public static String rotacionarPalavra(String palavra, int rotacao) {
        char letra, letraCodificada;
        String palavraCodificada = "";

        for (int i = 0; i < palavra.length(); i++) {
            letra = palavra.charAt(i);
            if (Character.isUpperCase(letra)) {
                letraCodificada = (char) ((letra - 'A' + rotacao) % 26 + 'A');
                palavraCodificada += letraCodificada;
            }
        }
        return palavraCodificada;
    }
}
