package Exemplos.lacos;

public class While {
	
	public static void main(String [] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println("Repetição... " + contador);
			contador++;
			Thread.sleep(1000);
			
		}
	}

}
