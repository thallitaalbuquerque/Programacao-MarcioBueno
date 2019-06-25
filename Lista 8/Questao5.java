package Lista8;
import java.util.Scanner;

public class Questao5 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[]args) {
		int inicio, termo;
		System.out.print("Digite qual valor devemos comecçar a soma: ");
		inicio = entrada.nextInt();
		System.out.print("Digite a quantidade de termos que deve ter: ");
		termo = entrada.nextInt();
		
		for(int i=inicio; i<=termo; i=i+3) {
			System.out.println(i);
		}
	}

}
