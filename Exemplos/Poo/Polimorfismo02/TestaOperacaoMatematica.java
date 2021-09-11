package Exemplos.Poo.Polimorfismo02;

public class TestaOperacaoMatematica {
	
	public static void calculadora(OperacaoMatematica op, double numero1, double numero2) {
		System.out.println(op.calcular(numero1, numero2));
		}
	public static void main (String [] args) {
		
		calculadora(new Soma(), 2,3);
		calculadora(new Multiplicar(), 2,3);
	}

}
