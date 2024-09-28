package aula10;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {

		double[] temp = new double[2];
		double media = 0;
		Scanner in = new Scanner(System.in);
		String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				         "Novembro", "Dezembro" };
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Digite as temperatura média de " + mes[i] + " ");
			temp[i] = in.nextDouble();
			media += temp[i];
		}
		
		media /= temp.length;
		System.out.println("Média anual: " + media);
		
		System.out.println();
		for (int i = 0; i < mes.length; i++) {
			if (temp[i] > media) {
				System.out.println(temp[i] + "->" + mes[i]);
			}
		}
		
		in.close();
	}

}
