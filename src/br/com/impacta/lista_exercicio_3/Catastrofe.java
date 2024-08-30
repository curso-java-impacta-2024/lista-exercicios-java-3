package br.com.impacta.lista_exercicio_3;

import java.util.Scanner;

public class Catastrofe {

	public static void main(String[] args) {
		
		int anoCatastrofe;
		
		
		Scanner scanner = new Scanner (System.in);
		
		do {
		System.out.println("Insira um ano:");
		anoCatastrofe = scanner.nextInt();
		
		if (anoCatastrofe >= 1899) {
		switch (anoCatastrofe) {
		//O NOME DAS CATRASTROFES EU NAO CONSEGUI IMAGINAR, ENTAO COLOQUEI UMA LISTA DE CATASTROFES EXISTENTES
			case (1900):
				System.out.println("1900: Grande Inundação de 1900 (Galveston, EUA)");
			break;
			case (1906):
				System.out.println("1906: Terremoto de San Francisco");
			break;
			case (1912):
				System.out.println("1912: Naufrágio do Titanic");
			break;
			case (1918):
				System.out.println("1918: Pandemia de Gripe Espanhola");
			break;
			case (1927):
				System.out.println("1927: Grande Inundação do Mississippi");
			break;
			case (1931):
				System.out.println("1931: Grande Inundação na China");
			break;
			case (1935):
				System.out.println("1935: Terremoto de Quetta");
			break;
			case (1941):
				System.out.println("1941: Bombardeio de Pearl Harbor");
			break;
			case (1945):
				System.out.println("1945: Bombas Atômicas em Hiroshima e Nagasaki");
			break;
			case (1954):
				System.out.println("1954: Inundações em Valdivia, Chile");
			break;
			case (1960):
				System.out.println("1960: Terremoto e Tsunami de Valdivia");
			break;
			case (1970):
				System.out.println("Ciclone Bhola");
			break;
			case (1974):
				System.out.println("1974: Grande Inundação de Bangladesh");
			break;
			case (1985):
				System.out.println("1985: Terremoto de México");
			break;
			case (1994):
				System.out.println("1994: Terremoto de Northridge");
			break;
			case (1999):
				System.out.println("1999: Terremoto de Izmit");
			break;
			case (2004):
				System.out.println("2004: Tsunami no Oceano Índico");
			break;
			case (2005):
				System.out.println("2005: Furacão Katrina");
			break;
			case (2010):
				System.out.println("2010: Terremoto no Haiti");			
			break;
			case (2011):
				System.out.println("2011: Terremoto e Tsunami no Japão");			
			break;
			case (2019):
				System.out.println("2019: Incêndios Florestais na Austrália");			
			break;
			case (2020):
				System.out.println("2020: Pandemia de COVID-19");			
			break;
			case (2021):
				System.out.println("2021: Incêndios Florestais na Grécia");			
			break;
			case (2022):
				System.out.println("2022: Terremoto na Turquia e Síria");			
			break;
			case (2023):
				System.out.println("2023: Ciclone Gabrielle na Nova Zelândia");			
			break;
			default:
				System.out.println(+anoCatastrofe +": Não houve catrastrofes neste ano. Tente outro ano.");
				break;
			} 
		}
	}
		while (anoCatastrofe >= 1899);
		scanner.close();
		System.out.println("Final");
		}
	}

