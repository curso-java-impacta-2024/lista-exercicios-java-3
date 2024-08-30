package br.com.impacta.lista_exercicio_3;

import java.util.Scanner;

public class Planetas {

	public static void main(String[] args) {
		int idadePlaneta1;
		int idadePlaneta2;

	Scanner scanner =  new Scanner(System.in);
	
	System.out.println("Digite a Idade do Primeiro Planeta: ");
	idadePlaneta1 = scanner.nextInt();
	
	System.out.println("Digite a Idade do Segundo Planeta: ");
	idadePlaneta2 = scanner.nextInt();
	
	if (idadePlaneta1 > idadePlaneta2) {
		System.out.println("O Primeiro Planeta, tem: " + idadePlaneta1 + " anos e é o mais Antigo");
	} else if(idadePlaneta1 < idadePlaneta2) {
		System.out.println("O Segundo Planeta, tem: " + idadePlaneta2 + " anos e é o mais Antigo");
	} else {
		System.out.println("O Primeiro Planeta, tem: " + idadePlaneta1 + " anos e o Segundo Planeta, tem: " 
				+ idadePlaneta2 + " anos. Sendo assim, ambos tem a mesma idade.");
	}
	
	scanner.close();
	
	}
}
