package Exercicio10;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int horasTrabalhadas, horasFaltados;
		double totalHoras, bonificacao, subtracao;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a quantiade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		System.out.println("Digite a quantidade de horas faltadas: ");
		horasFaltados = entrada.nextInt();
		
		subtracao = horasTrabalhadas - (2/3*horasFaltados);
		
		if(subtracao > 40) {
			subtracao = 200;
		}else if(subtracao <= 40) {
			subtracao = 175;
		}else if(subtracao <= 30 ) {
			subtracao = 150;
		}else if(subtracao <= 20) {
			subtracao = 125;
		}else{
			subtracao = 100;
		}
		
		System.out.printf("O funcionário receberá R$%.2f de gratificação de Natal.", subtracao);
	}
}