package Exemplos;

public class While02 {
	
	public static void main(String [] args) throws InterruptedException {
		
		int contador = 10;
		
		while (contador <= 10) {
			
			System.out.println("Repetição... " + contador);
			contador--;
			Thread.sleep(500);
		}
	}

}
