package aula10;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
				
				int[] posicoes = new int[10];
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				
				Scanner in = new Scanner(System.in);
				
				for (int i = 0; i < posicoes.length; i++) {
					System.out.println("Digite dez valores: ");
					posicoes[i] = in.nextInt();
					
					if (i == 0 || posicoes[i] > max) {
						max = posicoes[i];
					}
					
					if (posicoes[i] < min) {
						min = posicoes[i];
					}
				}
				
				System.out.println("O maior valor é: " + max + " O menor valor é: " + min);

				in.close();
			}
}

