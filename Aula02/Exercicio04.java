package Aula02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite seu n�mero: ");
		numero = ler.nextDouble();
		
		if (numero % 2 == 0) {
		
		numero = Math.sqrt(numero);
		System.out.println("Seu n�mero � par e o resultado de sua ra�z �: " + numero);
			}
		else {
			numero = Math.pow(numero, 2);
			System.out.println("Seu n�mero � impar e seu resultado elevado ao quadrado �: " + numero);
		}
	ler.close();
	
	}

}
