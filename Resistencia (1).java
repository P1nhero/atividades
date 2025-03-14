package calculo;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		double r1;
		double r2;
		double r3;
		double r4;
		
		Scanner ler =new Scanner(System.in);
		System.out.println("Digite os números para soma");
		System.out.println("Digite um número: ");
		r1 = ler.nextDouble();
		System.out.println("Digite outro número: ");
		r2 = ler.nextDouble();
		System.out.println("outro: ");
		r3 = ler.nextDouble();
		System.out.println("O ultimo número: ");
		r4 = ler.nextDouble();
		
		double resistencia_total = r1+r2+r3+r4;
		
		System.out.printf("Resistência total é igual a %f", resistencia_total);

	}

}
