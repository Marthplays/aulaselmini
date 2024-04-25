import java.util.Scanner;

public class par_ou_impar_ternario {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número:");
		numero = in.nextInt();
		
		System.out.println((numero % 2 == 0) ? "O seu número é par" : "O seu número é ímpar");
		// exp1 ? exp2 : exp3
		// exp1 é avaliada e, caso seja verdadeira exibirá a exp2, caso contrário exibirá a exp3.
		in.close();
	}
}
