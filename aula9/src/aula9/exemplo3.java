package aula9;

import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor1, valor2;
		
		do {
			System.out.println("Digite o primeiro valor:");
			valor1 = in.nextInt();
			System.out.println("Digite o segundo valor maior que o anterior:");
			valor2 = in.nextInt();
			if (valor1> valor2) {
				System.out.println("Valores inválidos, digite novos valores!"); 	
			}
		} while (valor1 <= valor2);
		
		while(valor1 <= valor2);
			if(valor1 % 2 == 1) {
			System.out.println(valor1 + " ");
		}
		valor1++;	
	}
		in.close();
	}