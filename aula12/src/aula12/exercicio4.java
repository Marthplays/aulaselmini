package aula12;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("Digite o valor de a:");
        a = in.nextInt();

        System.out.println("Digite o valor de b:");
        b = in.nextInt();

        System.out.println("Digite o valor de c:");
        c = in.nextInt();

        delta = calcularDelta(a,b,c);

        System.out.println("Delta = " + calcularDelta(a,b,c));
        System.out.println("X1 = " + calcularPositivo(a,b,c,delta));
        System.out.println("X2 = " + calcularNegativo(a,b,c,delta));
    }
    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public static double calcularPositivo(double a, double b,double c, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public static double calcularNegativo(double a, double b,double c, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
