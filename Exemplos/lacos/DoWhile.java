package Exemplos.lacos;

public class DoWhile {
	
	public static void main(String [] args) throws InterruptedException {
		
		int numero = 0;
		
		do {
			System.out.println("Repetição... " + numero);
			numero++;
			Thread.sleep(1000);
		}
		
		while(numero <= 10);
		}
	}


