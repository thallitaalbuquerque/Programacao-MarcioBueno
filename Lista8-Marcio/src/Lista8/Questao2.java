package Lista8;
import java.util.Scanner;

public class Questao2 {
	
	static Scanner entrada = new Scanner (System.in);
			
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de termos para verificar se é: ");
		int termos = entrada.nextInt();
		
		for (int i=1; i<=termos; i=i+1) {
			if(divisivelPor7(i)==true) {
				System.out.println(i+" é divisivel por 7.");
			}
		}
	}
	
	public static boolean divisivelPor7(int termo) {
		if(termo%7!=0) {
			return false;
		}
		return true;
	}

}
