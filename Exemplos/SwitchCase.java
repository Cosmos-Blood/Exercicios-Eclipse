package Exemplos;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva uma letra entre A e D: ");
		char letra = ler.nextLine().charAt(0);
		
		switch(letra) {
		case 'a', 'A':
			System.out.println("Ana");
		break;
		case 'b', 'B':
			System.out.println("Bruno");
		break;
		case 'c', 'C':
			System.out.println("Castor");
		break;
		case 'd', 'D':
			System.out.println("Draveeeeeeen");
		break;
		default:
			System.out.println("Seus caracteres não estão dentro do requisitado!");
		}
		
		ler.close();
		
	}

}
