package NumerosPrimos;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		int numPrimo, numDivisores=0;
		Scanner entrada  = new Scanner (System.in);
		System.out.print("Digite até qual valor devemos verificar se há número primo: ");
		numPrimo = entrada.nextInt();
		
		for (int i=1; i<numPrimo; i=i+1) {
			int cont=0, j;
			for(j=1; j<=i;j=j+1) {
				if(i%j==0) {
					cont=cont+1;
				}
			}
			 if(cont==2) {
				 System.out.println(i+" é um número primo!");
			 }
		}
	}
}
