package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um n�mero inteiro: ");
		num1 = entrada.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior n�mero digitado foi: "+num1);
		}else if (num1 < num2){
			System.out.println("O maior n�mero digitado foi: "+num2);
		}else{
			System.out.println("N�o existe um n�mero maior, pois os valores digitados foram os mesmos.");
		}
	}
}