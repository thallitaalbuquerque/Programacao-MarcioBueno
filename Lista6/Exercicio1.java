package Exercicio1;
import java.util.Scanner; 

public class Exercicio1 {
	
	public static void main(String[]args) {
		int idade;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Essa pessoa tem "+idade+" anos e é maior de idade.");
		}else {
			System.out.println("Essa pessoa tem "+idade+" anos e não é maior de idade.");
		}
	}

}