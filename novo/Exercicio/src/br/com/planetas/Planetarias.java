package br.com.planetas;

import java.util.Scanner;

public class Planetarias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner (System.in);
		
		double calcuPla1, calcuPla2;
		
		System.out.println("Qual e a idade do planeta 1 ? ");
		int pla1 = sc.nextInt();
		
		
		System.out.println("Qual e a idade do planeta 2 ? ");
		int pla2 = sc.nextInt();
		
		
		double sistemaSolar = 4.6; //Idade do sistema solar 
		
		
		calcuPla1 = pla1 - sistemaSolar;
		
		calcuPla2 = pla2 - sistemaSolar;
		
		
		
		if (calcuPla1 > calcuPla2 ) {
			
			System.out.println("O planeta 1 e mais antigo com " + calcuPla1 + " anos ");
			
			
		} else if (calcuPla2 > calcuPla1) {
			
			
			System.out.println("O paneta 2 e mais antigo com " + calcuPla2 + " anos" );
			
			
		} else {
			
			
			System.out.println("Os planetas tem a mesma idade");
			
		}
		
		
		sc.close();
		
		
		
		
		
		

	}

}
