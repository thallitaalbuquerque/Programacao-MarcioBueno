package MDC;
import java.util.Scanner;

public class MDC {
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Digite o valor do dividendo: ");
		int dividendo = entrada.nextInt();
		System.out.print("Digite o valor do divisor: ");
		int divisor = entrada.nextInt();
		int resultado = mdc(dividendo, divisor);
		
		System.out.println("O MDC desses valores é: "+resultado);
	}
	
	public static int mdc(int dividendo, int divisor) {
        if (dividendo % divisor == 0) {
        	return divisor;
	    }
	    return mdc(divisor, dividendo % divisor);
	}

}
