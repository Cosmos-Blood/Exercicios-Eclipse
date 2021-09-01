package Exemplos;

import java.util.Scanner;

public class CaculadoraIMC {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double imc,
		pesoEmQuilogramas = 0.0, 
		alturaEmMetros = 0.0;
		
		System.out.println("Digite seu peso atual: ");
		pesoEmQuilogramas = ler.nextDouble();
		
		System.out.println("Digite sua altura: ");
		alturaEmMetros = ler.nextDouble();
		
		imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		System.out.println("-- Valores do IMC -- ");
		
		System.out.println("Abaixo do peso: Menos de 18.5");
		System.out.println("Peso normal: Entre 18.5 e 24.9");
		System.out.println("Sobrepeso: Entre 25.0 e 29.9");
		System.out.println("Obesidade: Acima de 30.0");
		
		if (imc < 18.5) {
			System.out.println("\n\nSua situação é abaixo do peso!");
		} 
		else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("\n\nSeu peso está normal.");
		}
		else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println("\n\nSobrepeso.");
			}
		else if (imc > 29.9) {
			System.out.println("\n\nVocê está obeso!");
		}
		
		ler.close();
		
		
	}

}
