package Lista8;
import java.util.Scanner;

public class RamificacaoQuestao1 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Digite um número para servir de termo para verificar os pares: ");
		int termos = entrada.nextInt();
		
		for(int i=1; i<=termos; i=i+1) {
			if (ehPar(i)==true) {
				System.out.println(i+" é par.");
			}
		}
	}
	
	public static boolean ehPar(int termo) {
		if(termo%2!=0) {
			return false;
		}
		return true;
	}

}
