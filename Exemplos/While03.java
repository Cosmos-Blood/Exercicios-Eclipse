package Exemplos;

import java.util.Scanner;

public class While03 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = -1;
		
		while (numero != 10) {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			if(numero == 10) {
				System.out.println("Voc� acertou o n�mero!");
			}
			else {
				System.out.println("Voc� errou o n�mero!");
			}
		}
		ler.close();
	}

}
