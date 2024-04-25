import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String caractere;
		
		System.out.println("Digite um caractere:");
		caractere = in.next();
		
		caractere = caractere.toLowerCase();
		
		switch(caractere) {
		//Forma reduzida: case "a", "e", "i", "o", "u":
		//                default -> System.out.printLn("Não é uma vogal")
			case "a":
				System.out.println("O seu caractere é uma vogal");
				break;
			case "e":
				System.out.println("O seu caractere é uma vogal");
				break;
			case "i":
				System.out.println("O seu caractere é uma vogal");
				break;
			case "o":
				System.out.println("O seu caractere é uma vogal");
				break;
			case "u":
				System.out.println("O seu caractere é uma vogal");
				break;
			default:
				System.out.println("O seu caractere é uma consoante");	
		}	
		in.close();
	}
}
