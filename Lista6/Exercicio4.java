package Exercicio4;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int horasTrabalhadas;
		double salarioMinimo, impostoRenda, salarioHoraTrabalhada, quantidadeHoraTrabalhada, salario;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor do sal�rio min�mo: ");
		salarioMinimo = entrada.nextDouble();
		System.out.print("Digite o valor de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		
		quantidadeHoraTrabalhada = salarioMinimo*0.05;
		salarioHoraTrabalhada = horasTrabalhadas*quantidadeHoraTrabalhada;
		
		if(salarioHoraTrabalhada > 1500) {
			impostoRenda = salarioHoraTrabalhada*0.075;
			salario = salarioHoraTrabalhada-impostoRenda;
			System.out.println("O valor a ser recebido j� com o abatimento do imposto de renda �: "+salario);
		}else {
			System.out.println("O valor a ser recebido �: "+salarioHoraTrabalhada+" , pois n�o h� abatimento.");
		}
	}
}