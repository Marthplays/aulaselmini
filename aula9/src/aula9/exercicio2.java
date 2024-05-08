package aula9;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, multiplicador = 0, resultado;
		String frase = "";
		
		System.out.println("Digite o número do qual deseja a tabuada");
		numero = in.nextInt();
		
		frase.toLowerCase();
		do {  
			resultado = numero * multiplicador;
			System.out.println(resultado);
			multiplicador++;
         } while(multiplicador <= 10); 
		
		
		in.close();
  }  
}
