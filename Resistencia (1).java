package calculo;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		double r1;
		double r2;
		double r3;
		double r4;
		
		Scanner ler =new Scanner(System.in);
		System.out.println("Digite os n�meros para soma");
		System.out.println("Digite um n�mero: ");
		r1 = ler.nextDouble();
		System.out.println("Digite outro n�mero: ");
		r2 = ler.nextDouble();
		System.out.println("outro: ");
		r3 = ler.nextDouble();
		System.out.println("O ultimo n�mero: ");
		r4 = ler.nextDouble();
		
		double resistencia_total = r1+r2+r3+r4;
		
		System.out.printf("Resist�ncia total � igual a %f", resistencia_total);

	}

}
