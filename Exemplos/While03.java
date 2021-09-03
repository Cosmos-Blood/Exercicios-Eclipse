package Exemplos;

import java.util.Scanner;

public class While03 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = -1;
		
		while (numero != 10) {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			if(numero == 10) {
				System.out.println("Você acertou o número!");
			}
			else {
				System.out.println("Você errou o número!");
			}
		}
		ler.close();
	}

}
