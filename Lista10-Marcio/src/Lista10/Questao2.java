package Lista10;
import java.util.Scanner;
public class Questao2{
	static Scanner in = new Scanner(System.in);
	public static void main (String []args) {
		int op, figura;
		System.out.println("Escolha a opçào desejada: \n"
				+ "1- Cálculo de área \n"
				+ "2- Cálculo de volume \n"
				+ "0- Sair");
		op = in.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("1- Circulo \n"
						+ "2- Triangulo \n"
						+ "3- Retangulo \n"
						+ "4- Trapézio");
				figura = in.nextInt();
				if(figura == 1) {
					System.out.println("Diametro: ");
					double diametro = in.nextDouble();
					System.out.println(circulo(diametro));
				}else if(figura == 2) {
					System.out.println("Base: ");
					double base = in.nextDouble();
					System.out.println("Altura: ");
					double altura = in.nextDouble();
					System.out.println(triangulo(base, altura));
				}else if(figura == 3) {
					System.out.println("Base: ");
					double base = in.nextDouble();
					System.out.println("Lado: ");
					double lado = in.nextDouble();
					System.out.println(retangulo(base, lado));
				}else if(figura == 4) {
					System.out.println("Base menor: ");
					double baseMenor = in.nextDouble();
					System.out.println("Base maior: ");
					double baseMaior = in.nextDouble();
					System.out.println("Altura: ");
					double altura = in.nextDouble();
					System.out.println(trapezio(baseMenor, baseMaior, altura));
				}else {
					System.out.println("Opção inválida!");
				}
				break;
			case 2:
				System.out.println("1- Esfera \n"
						+ "2- Cilindo \n"
						+ "3- Cubo \n"
						+ "4- Paralelepípedo");
				figura = in.nextInt();
				if(figura == 1) {
					System.out.println("Diametro: ");
					double diametro = in.nextDouble();
					System.out.println(esfera(diametro));
				}else if(figura == 2){
					System.out.println("Diametro: ");
					double diametro = in.nextDouble();
					System.out.println("Altura: ");
					double altura = in.nextDouble();
					System.out.println(cilindro(diametro, altura));
				}else if(figura == 3) {
					System.out.println("Aresta: ");
					double aresta = in.nextDouble();
					System.out.println(cubo(aresta));
				}else if(figura == 4) {
					System.out.println("Comprimento: ");
					double comprimento = in.nextDouble();
					System.out.println("Largura: ");
					double largura = in.nextDouble();
					System.out.println("Altura: ");
					double altura = in.nextDouble();
					System.out.println(paralelepipedo(comprimento, largura, altura));
				}else {
					System.out.println("Opção inválida!");
				}
		}
	}
	
	public static double circulo(double diametro) {
		double raio = diametro/2;
		return 3.14 * (raio * raio);
	}
	
	public static double triangulo(double base, double altura) {
		return base * altura / 2;
	}
	
	public static double retangulo(double base, double lado) {
		return base * lado;
	}
	
	public static double trapezio(double baseMenor, double baseMaior, double altura) {
		return (baseMenor + baseMaior) * altura / 2;
	}
	
	public static double esfera(double diametro) {
		double raio = diametro/2;
		double area = 4 * 3.14 * Math.pow(raio, 3) / 3;
		return area;
	}
	
	public static double cilindro(double diametro, double altura) {
		double raio = diametro/2;
		return 3.14 * (raio * raio) * altura;
	}
	
	public static double cubo(double aresta) {
		return Math.pow(aresta, 3);
	}
	
	public static double paralelepipedo(double comprimento, double largura, double altura) {
		return comprimento * largura * altura;
	}

}
