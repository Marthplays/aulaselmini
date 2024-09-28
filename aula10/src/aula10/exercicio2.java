package aula10;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int[] posicoes = new int[5];
		Scanner in = new Scanner(System.in);
		int impar = 0;
		
		for (int i = 0; i < posicoes.length; i++) {
			System.out.println("Digite dez valores: ");
			posicoes[i] = in.nextInt();
			
			if (posicoes[i] % 2 != 0) {
				impar++;
			}
		}	
		
		System.out.println("Os números impares são: " + impar + " e os números pares são: " + (posicoes.length - impar));
		
		in.close();

	}

}
