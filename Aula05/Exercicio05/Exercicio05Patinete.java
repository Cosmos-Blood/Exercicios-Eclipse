package Aula05.Exercicio05;

public class Exercicio05Patinete {

	public static void main(String[] args) {
		
		Patinete modelo = new Patinete();
		
		modelo.setCor("Cinza");
		modelo.setFreios("Traseiros");
		modelo.setRodas("Emborrachado");
		modelo.setAlmofada("Almofoados");
		
		System.out.println("A cor do patinete é: " + modelo.getCor());
		System.out.println("Os freios está localizado na parte: " + modelo.getFreios());
		System.out.println("O material das rodas é: " + modelo.getRodas());
		System.out.println("O guidão do patinete está: " + modelo.getAlmofada());
		
		modelo.pati();

	}

}
