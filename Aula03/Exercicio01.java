package Aula03;

public class Exercicio01 { 
	public static void main(String [] args) {

	int inicio, fim = 1999, numeros;
	
		for (inicio = 1000; inicio <= fim; inicio++) {
			
			numeros = inicio % 11;
			if (numeros == 5) {
				System.out.println("Numeros cujo resultado da divisão por 11 é 5: " + "\n" + inicio);
			}
			
		}
		
	}
}
