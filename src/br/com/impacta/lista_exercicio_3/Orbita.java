package br.com.impacta.lista_exercicio_3;

import java.util.Scanner;

public class Orbita {

	public static void main(String[] args) {
		final double distanciaMediaSol = 1000;
		double distanciaAtual = distanciaMediaSol;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o fator de Mudança na Distancia para o Sol");
		double fatorMudanca = scanner.nextInt();
		System.out.println("O fator de Mudança, é: " +fatorMudanca);
		
		for(int ano = 1; ano <= 10; ano++) {
		
			distanciaAtual += fatorMudanca; 
			System.out.println("Distancia do Sol no Ano " + ano + " após o fator de mudança é de: " 
			+distanciaAtual);
		}

	}

}
