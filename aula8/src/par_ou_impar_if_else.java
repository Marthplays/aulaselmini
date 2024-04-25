import java.util.Scanner;

public class par_ou_impar_if_else {

	public static void main(String[] args) {
				
				Scanner in = new Scanner(System.in);
				int numero;
				
				System.out.println("Digite um número:");
				numero = in.nextInt();
				
				if (numero % 2 == 0) {
					System.out.println("Seu número é par");
				}
				else System.out.println("Seu número é impar");
				
				in.close();
			}
		}