package aula10;

import java.util.Random;

public class exemplo2 {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 10);
		
		Random rd = new Random();
		int x = rd.nextInt();
		int y = rd.nextInt(5);
		
		System.out.println(x);
		System.out.println(rand);
		System.out.println(y);
		

	}

}
