package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um número inteiro: ");
		num1 = entrada.nextInt();
		System.out.print("Digite outro número inteiro: ");
		num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior número digitado foi: "+num1);
		}else if (num1 < num2){
			System.out.println("O maior número digitado foi: "+num2);
		}else{
			System.out.println("Não existe um número maior, pois os valores digitados foram os mesmos.");
		}
	}
}