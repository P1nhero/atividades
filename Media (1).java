package media;

import java.util.Scanner;

public class Media {
	public static void main(String[]args) {
		double n1;
		double n2;
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Algoritmo para calcular a m�dia entre dois n�meros");
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextDouble();
		
		double media = (n1 + n2) / 2;
		System.out.printf("O valor da m�dia � %f.",media);
	}
		
	
	
}
