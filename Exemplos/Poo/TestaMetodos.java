package Exemplos.Poo;

public class TestaMetodos {
	
	static int multiplicador = 0, valor1 = 10, valor2 = 90;
	static double divisao = 0.0, num1 = 23.0, num2 = 2.0;
	
	
	public static void main (String [] args) {
		System.out.println("Método principal!");	
		
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(2,8);
	
	}

	public static void metodo1() {
		System.out.println("Este é o método 1!");
		
	}
	public static void metodo2() {
		int soma = 0, numero1 = 10, numero2 = 90;
		
		soma = numero1 + numero2;
		System.out.println("Soma dentro do método 2: " + soma);
	}
	public static void metodo3() {
		multiplicador = valor1 * valor2;
		divisao = num1 / num2;
		
	}
	public static void metodo4() {
		System.out.println("A multiplicação no método 3 é: " + multiplicador + " e a divisão é: " + divisao);

	}
	public static void metodo5(int numero1, int numero2) {
		int multi = numero1 * numero2;
		System.out.println("A multiplicação no método 5 é: " + multi);
		
	}

	
}
