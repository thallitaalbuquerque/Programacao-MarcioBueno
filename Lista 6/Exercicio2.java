package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double A, B, X;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor para A: ");
		A = entrada.nextDouble();
		System.out.println("Digite um valor para B: ");
		B = entrada.nextDouble();
		
		if (A > 0) {
			X = -B/A;
			System.out.println("A ra�z dessa equa��o do primeiro grau �: "+X);
		}else {
			System.out.println("Voc� n�o digitou um valor v�lido.");
		}
	}

}
