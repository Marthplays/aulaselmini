package aula9;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fatorial, numero = 1, resultado = 1;
		
		System.out.println("Digite um número do qual deseja o fatorial:");
		fatorial = in.nextInt();
		
		if (fatorial < 0) {
			System.out.println("O valor deve ser inteiro e positivo!");
		}
		else {
			while (numero <= fatorial) {
				resultado = resultado * numero;
				numero++;
			}
			System.out.println(resultado);
		}
	}
}
