package aula10;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		System.out.println("Total de funcionarios: ");
		total = in.nextInt();
		
		String[] nome = new String[total];
		double[] salario = new double[nome.length];
		double folha = 0;
		
		for (int i = 0; i < salario.length; i++) {
			in.nextLine();
			System.out.println("Funcionario:");
			nome[i] = in.nextLine();
			System.out.println("Salario: ");
			salario[i] = in.nextDouble();
			folha += salario[i];
			}
		
		System.out.println("Total da folha de pagamento R$ " + String.format("%.2f", folha));
		System.out.println("Média salarial R$ " + String.format("%.2f", folha / total));
		
		
		in.close();
	}
}
