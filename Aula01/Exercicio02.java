package Aula01;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dias, anos, meses, dia;
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dia = meses % 30;
		
		System.out.println("Você tem " + anos + " anos " + meses + " meses e " + dia + " dias.");
		
		ler.close();
		
	}

}
