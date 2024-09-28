package aula10;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[5];
		int aux;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite seus numeros:");
			numeros[i] = in.nextInt();
		}
		
		for (int i = 0; i < numeros.length / 2; i++) {
			aux = numeros[i];
			numeros[i] = numeros[numeros.length - 1 - i];
			numeros[numeros.length - 1 - i] = aux;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "");
		}
			in.close();
	}
}
