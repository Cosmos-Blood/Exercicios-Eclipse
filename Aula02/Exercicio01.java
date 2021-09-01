package Aula02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		
		System.out.println("Digite o primeiro número: ");
		nota1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		nota2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		nota3 = ler.nextInt();
		
		if (nota1 > nota2 && nota1 > nota3) {
			System.out.println("Sua maior nota foi: " + nota1);
		}
		if (nota2 > nota1 && nota2 > nota3) {
			System.out.println("Sua maior nota foi: " + nota2);
		}
		if (nota3 > nota1 && nota3 > nota2) {
			System.out.println("Sua maior nota foi: " + nota3);
		}
		
		ler.close();
	}

}
