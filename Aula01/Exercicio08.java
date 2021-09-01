package Aula01;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoConsumidor, custoFabrica;
		
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = ler.nextDouble();
		
		custoFabrica = custoFabrica + (custoFabrica * 0.28);
		custoConsumidor = custoFabrica + (custoFabrica * 0.48);
		
		System.out.println("O valor do custo ao consumidor é R$" + custoConsumidor);
		
		ler.close();
		
	}

}
