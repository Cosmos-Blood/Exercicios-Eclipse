package Aula03;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		
		while (idade != -99) {
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if (idade <= 21) {
				menor++;
			} else if (idade >= 50) {
				maior++;
			}
			System.out.println("Existem " + menor + " pessoa com 21 ou menos e " + maior + " pessoas maiores de 50.");
		}
		ler.close();

}
}
