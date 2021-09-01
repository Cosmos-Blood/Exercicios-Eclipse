package Aula02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite seu número: ");
		numero = ler.nextDouble();
		
		if (numero % 2 == 0) {
		
		numero = Math.sqrt(numero);
		System.out.println("Seu número é par e o resultado de sua raíz é: " + numero);
			}
		else {
			numero = Math.pow(numero, 2);
			System.out.println("Seu número é impar e seu resultado elevado ao quadrado é: " + numero);
		}
	ler.close();
	
	}

}
