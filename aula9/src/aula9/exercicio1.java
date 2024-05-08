package aula9;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rep = 1;
		double numero = 0, maior = Double.MIN_VALUE;
		
		while (rep <= 15) {
		System.out.println("Digite um número: ");
		numero = in.nextDouble();
		if (rep == 1 || numero > maior) {
			maior = numero;
		}
		rep++;
		}
	System.out.println(maior);
	in.close();
	}
}
