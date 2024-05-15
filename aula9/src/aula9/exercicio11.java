package aula9;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, diferenca = 0, divisor;
		
		System.out.println("Digite um número: ");
		numero = in.nextInt();
		
		if (numero <= 0) {
			System.out.println("Digite um número inteiro e positivo!");
		} else {
		for(divisor = 1; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
			diferenca++;
			}
		}
		if (diferenca == 1) {
			System.out.println("primo");
		} else {
			System.out.println("não primo");
		}
		in.close();
		}
	}
}	

