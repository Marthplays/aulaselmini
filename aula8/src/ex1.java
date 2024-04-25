import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String caractere;
		
		System.out.println("Digite um caractere:");
		caractere = in.next();
		
		caractere.toLowerCase();
		//transforma a variavel letra em minusculo.
		caractere = caractere.toLowerCase();
		
		if (caractere.equals("a") || caractere.equals("e") || caractere.equals("o") || caractere.equals("u") || caractere.equals("i")) {
			System.out.println("Seu caractere é uma vogal!");
		}
		else {	
			System.out.println("Seu caractere é uma consoante!");
		}
		in.close();
	}

}
