package Aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String [] args) {
		
		int idadeAnos, idadeMeses, idadeDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em " + "\nAno: ");
		idadeAnos = ler.nextInt();
		System.out.println("Meses: ");
		idadeMeses = ler.nextInt();
		System.out.println("Dias: ");
		idadeDias = ler.nextInt();
		
		idadeAnos = idadeAnos * 365;
		idadeMeses = idadeMeses * 30;
		
		System.out.println("Sua idade em dias é: " + (idadeAnos + idadeMeses + idadeDias));
		
		ler.close();
		
	}
}