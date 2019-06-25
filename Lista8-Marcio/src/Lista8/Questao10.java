package Lista8;
import java.util.Scanner;

public class Questao10 {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Digite a quantidade do grupo: ");
		int quantidade = entrada.nextInt();
		int numero, cont=1;
		double maiorMulher=0, menorMulher=Integer.MAX_VALUE, maiorHomem=0, menorHomem=Integer.MAX_VALUE, altura;
		double contHomem=0, somatorioHomem=0, contMulher=0, somatorioMulher=0;
		
		do {
			System.out.print("Digite 1 para homem e 2 para mulher: ");
			numero = entrada.nextInt();
			System.out.print("Digite sua altura: ");
			altura = entrada.nextDouble();
			
			if(numero==1) {
				if(altura<menorHomem) {
					menorHomem=altura;
				}
				if(altura>maiorHomem) {
					maiorHomem=altura;
				}
				contHomem=contHomem+1;
				somatorioHomem = somatorioHomem+altura;
			}else if(numero==2) {	
				if(altura<menorMulher) {
					menorMulher=altura;
				}
				if(altura>maiorMulher) {
					maiorMulher=altura;
				}
				contMulher=contMulher+1;
				somatorioMulher=somatorioMulher+altura;
			}else {
				System.out.println("Opção Invalida!");
			}
			
			cont=cont+1;
		}while(cont<=quantidade);
		
		somatorioHomem=somatorioHomem/contHomem;
		somatorioMulher=somatorioMulher/contMulher;
		
		System.out.println("A altura média dos homens é: "+somatorioHomem);
		System.out.println("A altura média das mulheres é: "+somatorioMulher);
		
		if(maiorHomem<maiorMulher) {
			System.out.println("A maior altura é de uma mulher com "+maiorMulher);
		}else {
			System.out.println("A maior altura é de um homem com "+maiorHomem);
		}
		
	}

}
