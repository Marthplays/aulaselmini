package aula10;

import java.util.Random;

public class exercicio10 {

	public static void main(String[] args) {
		
		Random rng = new Random();
		int[] numeros = new int[rng.nextInt(0, 100)];
		int aux;
		
		// armazenar valores
		// faixa de valores: -2^32 até +2^32
		System.out.println("Valor desordenado: ");
		for (int i = 0; i < numeros.length; i++) {
	       numeros[i] = rng.nextInt(100);
	       System.out.print(numeros[i] + " ");
	    }
		
		//ordenaçao --> ordem crescente
		for (int j = 0; j < numeros.length; j++) {
			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] > numeros[i+1]) {
					aux = numeros[i];
					numeros[i] = numeros[i+1];
					numeros[i+1] = aux;
				}
			}
		}
		
		//impressão após a ordenação
		// foreach abaixo: é uma ação que permite executar uma função para cada elemento, sejam eles arrays simples ou de objetos
		System.out.println("\nValor ordenado: ");
		for (int i : numeros) {
			System.out.print(i + " ");
		}
	}
}