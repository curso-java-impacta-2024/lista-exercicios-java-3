package br.com.planetas;

import java.util.Scanner;

public class EventoHistorico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		int ano; 
		
		do {
			
		
			
			System.out.println("Informe um ano histórico que ocorreu:");
			 ano = sc.nextInt();
			
			
			switch(ano){
			
			case 1755:
				System.out.println("Terremoto de Lisboa");
			break;
			
			case 1908:
				System.out.println("Colisão de Tunguska");
			break;
			
			case 1986:
				System.out.println("Desastre de Chernobyl");
			break;
			
			case 2004:
				System.out.println("Terremoto e Tsunami no Oceano Índico");
			break;
			
			case 2005:
				System.out.println("Fruração Katrina");
			break;
			
			case 2013:
				System.out.println("Impacto de Chelyabinsk");
			break;
			
			default:
				System.out.println("Inválido");
			
								
			}
			
			System.out.println("Digite novamente o ano  ");
			System.out.println();
			
			
				

		} while (ano > 0);
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		

	}

}
