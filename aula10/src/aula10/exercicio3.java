package aula10;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int[] alunos = new int[10];
		double[] notas = new double[4];
		int passaram = 0;
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < alunos.length; i++) {
			double soma = 0;
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite suas quatro notas:");
				notas[j] = in.nextDouble();
				soma += notas[j];
				if (soma / 4 >= 6) {
					passaram++;
				}
			}
		}
		System.out.println("Número de alunos que passaram: " + passaram);
		in.close();
	}

}
