package Exercicio9;
import java.util.Scanner;

public class Exercico9 {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor da primeira nota: ");
		nota1 = entrada.nextFloat();
		System.out.print("Digite o valor da segunda nota: ");
		nota2 = entrada.nextFloat();

		media = (nota1+nota2)/2;
		
		if (media >= 7) {
			System.out.println("Parab�ns! Voc� foi aprovado!");
		}else if (media >= 3) {
			System.out.println("Voc� ter� que realizar um exame final.");
		}else {
			System.out.println("Infelizmente voc� reprovou nessa disciplina.");
		}
	}
}