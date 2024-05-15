package aula9;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, multiplicador = 0, resultado;
		String resposta;
		
		while (true) {
			System.out.println("Digite o número do qual deseja a tabuada");
			numero = in.nextInt();
			
			while (multiplicador <= 10) {
			resultado = numero * multiplicador;
			System.out.println(numero + " * " + multiplicador + " = " + resultado);
			multiplicador++; 
			}
			System.out.println("\nDeseja outra tabuada (sim/nao)? ");
			resposta = in.next();
			// o \n tem a função de dar um enter e enviar o codigo para a proxima linha
			if (resposta.equalsIgnoreCase("nao")) {
				break;
			} else {
				multiplicador = 0;
			}
		}
		in.close();
  }  
}
