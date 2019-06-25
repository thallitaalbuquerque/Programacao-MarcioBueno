package Lista8;
import java.util.Scanner;

public class Questao3 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Digite um número para a quantidade de termos: ");
		int termos = entrada.nextInt();
		
		if(termos>0) {
			for(int i=0; i<=termos; i=i+1) {
				if(div9Rest4(i)==true) {
					System.out.println(i+" é divisível por 9 e com resto 4.");
				}
			}
		}
		
	}
	
	public static boolean div9Rest4(int termo) {
		if(termo%9!=4) {
			return false;
		}
		return true;
	}

}
