package conta_de_agua;
import java.util.Scanner;
public class Conta_de_agua {
		
	public void main(String [] args){
		
		double consumo, preco_total, preco_fixo,taxa, preco_ativado;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("SISTEMA DE COMBRAÇA DE AGUA");
			System.out.println(" qual valor consumido?: ");
				consumo = ler.nextDouble();
		}
		preco_total = 0;
		  preco_fixo = 0;
		  taxa = 0;
		  preco_ativado = 0;
		
		double consumo_atual;
		if(consumo <=10){
		  preco_total = 7;
		  preco_fixo = 7;
		  consumo_atual = consumo;
		}
		
		if((consumo <= 10) && (consumo <= 30)){
		    preco_fixo = 7;
		    taxa = 1;
		}
		
		if((consumo > 30) && (consumo <= 100)){
		    preco_fixo = 7 + 20;
		    taxa = 2;
		}
		
		if(consumo > 100){
		  preco_fixo = 7 + 20 + 140;
		  taxa = 5;
		}
		
		double consumo_desconto = 0;
		consumo_atual = consumo_desconto;
		
		preco_ativado = taxa * consumo_atual;
		
		preco_total = preco_fixo + preco_ativado;
		
		System.out.println("Total a ser pago é: " + preco_total);
		  
				
		
		
		
	}
}
