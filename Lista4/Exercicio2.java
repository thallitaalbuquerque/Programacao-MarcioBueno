package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double raio, area, pi=3.14, circun, volumeEsfera;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor do raio: ");
		raio = entrada.nextDouble();
		
		circun = 2*pi*raio;
		area = pi*(Math.pow(raio, 2));
		volumeEsfera = 3.0/4.0*pi*(Math.pow(raio, 3));
		
		System.out.println("O valor do comprimento da circunferência com o raio "+raio+ " é: "+circun+". \n"
				+"O valor da área de um círculo com o raio "+raio+" é: "+area+". \n"
						+"O valor do volume de uma esfera com raio "+raio+" é: "+volumeEsfera);
	}

}