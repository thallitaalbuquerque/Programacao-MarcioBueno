package Exercicio5;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int tempoServico;
		double salario, salarioBonificacao, bonificacao;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o seu tempo de empresa em anos: ");
		tempoServico = entrada.nextInt();
		System.out.print("Digite o seu salário: ");
		salario = entrada.nextDouble();
		
		if(tempoServico >= 10){
			salarioBonificacao = salario+salario*0.2;
			bonificacao = salarioBonificacao - salario;
			System.out.println("O valor da sua gratificação é: "+bonificacao+" e seu salario esse mês é: "+salarioBonificacao);
		}else {
			salarioBonificacao = salario+salario*0.1;
			bonificacao = salarioBonificacao - salario;
			System.out.println("O valor da sua gratificação é: "+bonificacao+" e seu salario esse mês é: "+salarioBonificacao);
		}
	}
}