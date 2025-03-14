package interrupcao;

import java.util.Scanner;

public class Interrupcao {

	public static void main(String[] args) {
		double r1,r2,r3;
		
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("INFORME O VALOR DAS RESISTÊNCIA!");
		 System.out.println("Valor Resistência 1 = ");
		 r1 = ler.nextDouble();
		 System.out.println("Valor Resistência 2 = ");
		 r2 = ler.nextDouble();
		 System.out.println("Valor Resistência 3 = ");
		 r3 = ler.nextDouble();
		 
		 System.out.println("ESCOLHA A OPÇÃO!");
		 System.out.println(" [1] ");
		 System.out.println(" [2] ");
		 
		 String opcao = ler.next();
		 
		 double resistencia;
		 
		 switch (opcao) {
		 case "1": {
			 resistencia = r1 + r2 + r3;
			 break;
			 
		 }case "2":{
			 resistencia = (1/r1)+(1/r2)+(1/r3);
			 break;
		 }
		 default:{
			 System.out.println("Opção Inválida ");
			 resistencia = 0;
		 }
		 }
		
		 System.out.println("Resistência Total é igual a "+resistencia);
		 

	}


	}

