package secao02;

import java.util.Scanner;

public class problema03 {
//NUMERO DE EULER
	public static void main(String[] args) {
		
		double ex = 0;
		double x;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de X");
		
		x = scanner.nextDouble();
		
		for(int i = 1; i <= 30; i++) 
			ex = ex  + (Math.pow(x, i))/fatorial(i);
		
		System.out.println("O valor de e("+x+") é ="+ex);
		
		scanner.close();

	}
	
	public static int fatorial(int i) {
		
		int resultado = 1;
		
		for(int j = 1; j <= i; j++) {
			resultado *= j;
			
		}
	return resultado;
	}
}
