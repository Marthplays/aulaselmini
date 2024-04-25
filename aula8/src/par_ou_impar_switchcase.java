import java.util.Scanner;

public class par_ou_impar_switchcase {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número:");
		numero = in.nextInt();
		
		switch (numero % 2) {
			case 0:
			System.out.println("Seu número é par");
			break;
			default:
			System.out.println("Seu número é ímpar");
		
		in.close();	
		}
	}
}
