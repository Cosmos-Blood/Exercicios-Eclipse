package Exemplos;

public class TestaMetodos {
	
	static int multiplicador = 0, valor1 = 10, valor2 = 90;
	static double divisao = 0.0, num1 = 23.0, num2 = 2.0;
	
	
	public static void main (String [] args) {
		System.out.println("M�todo principal!");	
		
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(2,8);
	
	}

	public static void metodo1() {
		System.out.println("Este � o m�todo 1!");
		
	}
	public static void metodo2() {
		int soma = 0, numero1 = 10, numero2 = 90;
		
		soma = numero1 + numero2;
		System.out.println("Soma dentro do m�todo 2: " + soma);
	}
	public static void metodo3() {
		multiplicador = valor1 * valor2;
		divisao = num1 / num2;
		
	}
	public static void metodo4() {
		System.out.println("A multiplica��o no m�todo 3 �: " + multiplicador + " e a divis�o �: " + divisao);

	}
	public static void metodo5(int numero1, int numero2) {
		int multi = numero1 * numero2;
		System.out.println("A multiplica��o no m�todo 5 �: " + multi);
		
	}

	
}
