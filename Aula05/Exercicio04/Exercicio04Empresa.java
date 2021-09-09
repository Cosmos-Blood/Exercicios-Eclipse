package Aula05.Exercicio04;

public class Exercicio04Empresa {
	public static void main (String [] args) {
		
		Empresa funcionario = new Empresa();
		
		funcionario.setEmpresa("Refrigerantes puro açucar");
		funcionario.setNome("Cássio");
		funcionario.setEnsino("Médio completo");
		funcionario.setCargo("Balconista");
		funcionario.setPontual("Sim");
		
		System.out.println("Para qual empresa o funcionário trabalha? " + funcionario.getEmpresa());
		System.out.println("Qual o nome do funcionário? " + funcionario.getNome());
		System.out.println("Qual ano cursou? " + funcionario.getEnsino());
		System.out.println("Qual função exercida? " + funcionario.getCargo());
		System.out.println("O funcionário é pontual? " + funcionario.getPontual());
	
	funcionario.funf();
	}

}
