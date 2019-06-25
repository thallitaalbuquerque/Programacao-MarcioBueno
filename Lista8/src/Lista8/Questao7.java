package Lista8;
import java.util.Scanner; 

public class Questao7 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		int numero, menor=Integer.MAX_VALUE, maior=0;
		do{
			System.out.print("Digite um número inteiro ou 0 para parar o programa: ");
			numero = entrada.nextInt();
			if(numero<0) {
				System.out.println("Número inválido!");
			}else {
				if(numero==0) {
					break;
				}
				if(numero<menor) {
					menor=numero;
					System.out.println(menor);
				}
				
				if(numero>maior) {
					maior=numero;
				}	
			}
		}while(numero!=0);
		
		System.out.println("O maior número digitado foi: "+maior);
		System.out.println("Enquanto o menor número digitado foi: "+menor);
	}

}
