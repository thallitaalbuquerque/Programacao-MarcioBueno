package Exercicio3;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um n�mero inteiro: ");
		numero = entrada.nextInt();
		
		if (numero > 0 || numero < 0) {
			if(numero %  2 == 0) {
				System.out.println("Este n�mero � par.");
			}else {
				System.out.println("Esse n�mero � �mpar.");
			}
		}else {
			System.out.println("Voc� digitou 0 e ele � um n�mero neutro.");
		}
	}
}