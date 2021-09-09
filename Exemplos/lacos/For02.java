package Exemplos.lacos;

public class For02 {
	public static void main (String [] args) {
		
		int n = 20,
			i,
			soma;
		
		for(i = 0, soma = 0; i <= n ; i++) {
			
			System.out.print("Soma " + soma + " mais " + i);
			soma += i;
			System.out.println(" = " + soma + "\n");
		}
	}

}
