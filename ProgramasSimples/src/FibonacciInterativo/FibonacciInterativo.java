package FibonacciInterativo;

import java.util.Scanner;
import java.util.Scanner;

public class FibonacciInterativo {
	
	public static void main(String[] args) {
		int numero, i;
		Scanner entrada = new Scanner (System.in);
		 System.out.print("Digite quantos termos de fibonacci serão impressos: ");
		 numero = entrada.nextInt();
		 
		 for(i=1; i<=numero; i=i+1) {
			 System.out.println(fibInterativo(i));
		 }
	}
	
	public static long fibInterativo(int n) {
		int i;
        long fib1=0, fib2=1, fibAtual=0;
        if(n == 0 || n ==1){
            return n;
        }
        for (i=1; i < n; i=i+1){
            fibAtual = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibAtual;
        }
        return fibAtual;
	}	
}
