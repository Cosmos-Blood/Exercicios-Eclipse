package Exemplos.Teste;

public class TesteUnidade {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		int resultadoEsperado = 4;
		
		double resultado = cal.somar(2.0, 2);
		
		if(resultado == resultadoEsperado) {
			System.out.println("Okey");
		}
		else {
			System.out.println("Vixe!");
		}

	}

}
