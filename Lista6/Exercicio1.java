package Exercicio1;
import java.util.Scanner; 

public class Exercicio1 {
	
	public static void main(String[]args) {
		int idade;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Essa pessoa tem "+idade+" anos e � maior de idade.");
		}else {
			System.out.println("Essa pessoa tem "+idade+" anos e n�o � maior de idade.");
		}
	}

}