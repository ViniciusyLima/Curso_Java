package projeto_exer;

import java.util.Scanner;

public class exer7 { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();
	    total = cod1 + cod2;
	    total = preco1 * qte1 + preco2 * qte2;
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}
