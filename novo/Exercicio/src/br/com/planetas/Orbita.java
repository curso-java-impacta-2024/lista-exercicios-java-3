package br.com.planetas;

import java.util.Scanner;

public class Orbita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		Scanner sc = new Scanner (System.in);
		
		
		double Marte = 227.9;
		
		
		System.out.println("Informe um fator de mudança: ");
		double mudanca = sc.nextDouble();
		
		
		for (double sol = 0; sol < 4.6; sol++) {
			
			int ano =10;
			
			double planetaMarte = Marte * (mudanca * Math.sqrt(ano)); 
			
			
			
			System.out.println(planetaMarte + " milhões de km ");
			
			
		}
		
		
		
		
		
		
		

	}

}
