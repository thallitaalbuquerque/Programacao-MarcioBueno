package Lista8;
import java.util.Scanner;

public class Questao8 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		int numero;
		System.out.print("Digite um número entre 1 e 10 para ser multiplicado: ");
		numero = entrada.nextInt();
		
		if(numero>1 && numero<=10) {
			for(int i=0; i<=10; i=i+1) {
				System.out.println(i+"x"+numero+"="+i*numero);
			}
		}

	}

}
