package aula12;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Digite o valor do primeiro valor:");
        valor1 = in.nextInt();

        System.out.println("Digite o valor do segundo valor:");
        valor2 = in.nextInt();

        System.out.println("Digite o valor do terceiro valor:");
        valor3 = in.nextInt();

        System.out.println("Maior valor = " + maiorValor(valor1,valor2,valor3));
    }
    public static int maiorValor(int valor1, int valor2, int valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            return valor1;
        }
        else if (valor2 > valor3) {
            return  valor2;
        }
        return valor3;
    }
}
