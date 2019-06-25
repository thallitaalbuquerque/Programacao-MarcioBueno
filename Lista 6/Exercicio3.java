package Exercicio3;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		numero = entrada.nextInt();
		
		if (numero > 0 || numero < 0) {
			if(numero %  2 == 0) {
				System.out.println("Este número é par.");
			}else {
				System.out.println("Esse número é ímpar.");
			}
		}else {
			System.out.println("Você digitou 0 e ele é um número neutro.");
		}
	}
}