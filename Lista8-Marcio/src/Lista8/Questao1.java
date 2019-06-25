package Lista8;
import java.util.Scanner;
public class Questao1 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Digite até qual número deseja verficar se é par: ");
		int termo = entrada.nextInt();
		int contPar=0;
		
		for(int i=1; i<=termo;i=i+1) {
			if(i%2==0) {
				contPar = contPar+1;
				System.out.println(i+" é um número par.");
			}
		}
		
		System.out.print("A quantidade de números pares é igual a "+contPar);
		
	}

}
