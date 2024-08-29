package aula11;

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		Random rng = new Random();
		int soma1, soma2;
		int[][] x = new int[10][10];
		
		//entrada de dados
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = rng.nextInt(1000);
			}
		}
		
		//impressao no formato de tabela
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		

	}

}
