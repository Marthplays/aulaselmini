/*
*	Programa para ler dois valores ( o primeiro valor deverá ser menor que o segundo).
*   Seu programa deverá imprimir todos os números ímpares entre o primeiro valor e o segundo.
*/
package aula9;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("Digite o primeiro valor:");
		valor1 = in.nextInt();
		System.out.println("Digite o segundo valor maior que o anterior:");
		valor2 = in.nextInt();
		
		if (valor1> valor2) {
			System.out.println("O primeiro valor deve ser menor que o segundo.");
		}
		else {
		while (valor1 <= valor2) {
			if(valor1 % 2 == 1) {
				System.out.println(valor1 + " ");
			}
			valor1++;	
		}
		}
		in.close();
	}
}
