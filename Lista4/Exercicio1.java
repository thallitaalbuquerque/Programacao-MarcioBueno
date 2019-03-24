package Exercicio1;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		double reais, euro, dolar, libras;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor que você esta levando em reais para viajar: R$ ");
		reais = entrada.nextDouble();
		
		euro = reais * 0.23;
		dolar = reais * 0.26;
		libras = reais * 0.20;
		
		System.out.println("Convertendo esse valor para euros você terá: €" +euro+". \n"
				+ "Convertendo esse valor para dólares você terá: $ "+dolar+". \n"
						+ "Convertendo esse valor para libras você terá: £ "+libras+".");
	}
}