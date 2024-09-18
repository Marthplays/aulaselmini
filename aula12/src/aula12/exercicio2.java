package aula12;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Digite o valor do primeiro valor:");
        lado1 = in.nextInt();

        System.out.println("Digite o valor do segundo valor:");
        lado2 = in.nextInt();

        System.out.println("Digite o valor do terceiro valor:");
        lado3 = in.nextInt();

        if(validar(lado1,lado2,lado3)) {
            classificar(lado1,lado2,lado3);
        } else {
            System.out.println("Os valores não formam um triângulo!");
        }
    }

    public static boolean validar (double lado1, double lado2,double lado3) {
        return (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2);
    }

    public static void classificar(double lado1, double lado2,double lado3) {
        String tipo = null;
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }



}
