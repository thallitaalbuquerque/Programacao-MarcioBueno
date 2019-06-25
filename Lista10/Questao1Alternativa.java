package Lista10;
import java.util.Scanner;

public class Questao1Alternativa {
	static Scanner in = new Scanner(System.in);
	public static void maind (String []args) {
		int op;
		do {
			System.out.println("Escolha a opção desejada: \n"
					+ "1- Verificar se número inteiro é divisível por outro \n"
					+ "2- Arredondar um número real para um número inteiro \n"
					+ "3- Encontrar o MDC de dois números \n"
					+ "4- Ordenar 3 números em ordem crescente \n"
					+ "0 - Sair");
			op = in.nextInt();
			
			switch(op) {
				case 0:
					break;
				case 1:
					System.out.println("Informe o número: ");
					int numero = in.nextInt();
					System.out.println("Informe o divisor: ");
					int divisor = in.nextInt();
					boolean validacao = divisivel(numero, divisor);
					if(validacao) {
						System.out.println("O número " + numero + " é divisível por " + divisor);
					}else {
						System.out.println("O número " + numero + "não é divisível por " + divisor);
					}
					break;
				case 2:
					System.out.println("Informe um número real: ");
					double real = in.nextDouble();
					double arredondado = arredondar(real);
					System.out.println("Número " + real + " arredondado: " + arredondado);
					break;
				case 3:
					//não fiz miga, desculpa KKKK
					break;
				case 4:
					int n1, n2, n3;
					System.out.println("Informe o primeiro número: ");
					n1 = in.nextInt();
					System.out.println("Informe o segundo número: ");
					n2 = in.nextInt();
					System.out.println("Informe o terceiro número: ");
					n3 = in.nextInt();
					ordenar(n1, n2, n3);
					break;
				default:
					System.out.println("Opção inválida!");
			}
		}while(op != 0);
	}
	
	public static boolean divisivel(int numero, int divisor) {
		if(numero%divisor == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static double arredondar(double numero) {
		return Math.round(numero);
	}
	
	public static void ordenar(int n1, int n2, int n3) {
		int menor, meio, maior;
		if(n1 > n2 && n1 > n3) {
			maior = n1;
			if(n2 > n3) {
				meio = n2;
				menor = n3;
			}else {
				meio = n3;
				menor = n2;
			}
		}else if(n2 > n1 && n2 > n3) {
			maior = n2;
			if(n1 > n3) {
				meio = n1;
				menor = n3;
			}else {
				meio = n3;
				menor = n1;
			}
		}else {
			maior = n3;
			if(n1 > n2) {
				meio = n1;
				menor = n2;
			}else {
				meio = n2;
				menor = n1;
			}
		}
		
		System.out.println(menor + ", " + meio + ", " + maior);
	}

}