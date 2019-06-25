package Exercicio3;
import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {
		int A, B, newA, newB;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor para A: ");
		A = entrada.nextInt();
		System.out.println("Digite um valor para B: ");
		B = entrada.nextInt();
		
		newA = B;
		newB = A;
		
		System.out.println("O novo valor de A é "+newA+" e o novo valor de B é "+newB+".");
	}

}