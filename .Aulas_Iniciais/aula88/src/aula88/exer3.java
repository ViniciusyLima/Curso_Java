package aula88;

import java.util.Locale;
import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.println("Digite um numero");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos");
		
		for (int i=0;i<vect.length;i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();	
	}
}
