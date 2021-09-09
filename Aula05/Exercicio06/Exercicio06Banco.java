package Aula05.Exercicio06;

public class Exercicio06Banco {
	
	public static void main (String [] args) {
		
		Banco pay = new Banco();
		
		pay.setBanco("IBrasil");
		pay.setConta("Corrente");
		pay.setOperacao("Extração");
		
		System.out.println("Qual banco a pessoa está cadastrada? " + pay.getBanco());
		System.out.println("Que tipo de conta? " + pay.getConta());
		System.out.println("Qual a ação efetuada? " + pay.getOperacao());
	
		pay.operation();
	}

}
