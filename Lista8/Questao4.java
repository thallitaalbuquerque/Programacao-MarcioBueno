package Lista8;
import java.util.Scanner;

public class Questao4 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite o número inicial: ");
		int numInicio = entrada.nextInt();
		System.out.println("Digite o número final: ");
		int numFinal = entrada.nextInt();
		
		for (int i=numInicio; i<=numFinal; i=i+1) {
			System.out.println(numCubicos(i));
		}
	}

	public static int numCubicos(int num) {
		double cubo;
		cubo = Math.pow(num, 3);
		return (int) cubo;
	}
	
}