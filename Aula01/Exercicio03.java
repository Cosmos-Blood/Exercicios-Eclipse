package Aula01;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, horas, minutos, segundo;
		
		System.out.println("Digite o tempo da duração do evento: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundo = minutos % 60;
		
		System.out.println("O evento durou exatamente: " + horas + " horas " + minutos + " minutos " + segundo + " segundos.");
		
		ler.close();
	}

}
