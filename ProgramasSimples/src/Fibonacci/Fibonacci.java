package Fibonacci;

import java.util.Scanner;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		int numero, i;
		Scanner entrada = new Scanner (System.in);
		 System.out.print("Digite quantos termos de fibonacci serão impressos: ");
		 numero = entrada.nextInt();
		 
		 for(i=1; i<=numero; i=i+1) {
			 System.out.println(fibonacci(i));
		 }
	}
	
	public static long fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
