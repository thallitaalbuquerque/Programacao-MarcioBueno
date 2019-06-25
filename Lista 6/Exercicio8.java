package Exercicio8;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double a, b, c, raiz1, raiz2, delta, raizDelta;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		a = entrada.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = entrada.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = entrada.nextDouble();
		
		if(a != 0) {
			delta = (Math.pow(b, 2))-(4*(a*c));
			raizDelta = Math.sqrt(delta);
			
			if(delta >=0) {
				if(delta >=0){
	                raiz1 = ((-1)*b + raizDelta)/(2*a);
	                raiz2 = ((-1)*b - raizDelta)/(2*a);
	                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
				}else {
					delta = -delta;
	                raizDelta = (float)Math.sqrt(delta);
	                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (raizDelta)/(2*a));
	                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (raizDelta)/(2*a));
				}
			}else {
				System.out.println("O valor de 'a' é inválido.");
			}
		}
	}
}