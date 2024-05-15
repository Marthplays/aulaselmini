package aula9;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0, divisor = 1;
		
		System.out.println("Digite um número: ");
		numero = in.nextInt();
		
		if (numero <= 0) {
			System.out.println("Digite um número inteiro e positivo!");
		} else {
		for(divisor = 1; divisor <= numero; divisor++) {
			if (divisor != 0 && numero % divisor == 0) {
				System.out.println(divisor + "");
				}
			}
		}
		in.close();
	}

}
