package Exercicio6;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int quilowatts;
		double tarifaMinima=7.0, taxaIluminacaoPublica=3.5, valorQuilowatts=1.4, valorConta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor gasto em quilowatts: ");
		quilowatts = entrada.nextInt();
		
		if (quilowatts >= 10) {
			valorConta = (quilowatts*valorQuilowatts)+taxaIluminacaoPublica;
			System.out.println("O valor da sua conta esse mês é de R$ "+valorConta);
		}else {
			valorConta = tarifaMinima+taxaIluminacaoPublica;
			System.out.println("O valor da sua conta esse mês é de R$ "+valorConta);
		}
	}
}