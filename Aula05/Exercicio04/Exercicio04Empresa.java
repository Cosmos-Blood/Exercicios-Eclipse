package Aula05.Exercicio04;

public class Exercicio04Empresa {
	public static void main (String [] args) {
		
		Empresa funcionario = new Empresa();
		
		funcionario.setEmpresa("Refrigerantes puro a�ucar");
		funcionario.setNome("C�ssio");
		funcionario.setEnsino("M�dio completo");
		funcionario.setCargo("Balconista");
		funcionario.setPontual("Sim");
		
		System.out.println("Para qual empresa o funcion�rio trabalha? " + funcionario.getEmpresa());
		System.out.println("Qual o nome do funcion�rio? " + funcionario.getNome());
		System.out.println("Qual ano cursou? " + funcionario.getEnsino());
		System.out.println("Qual fun��o exercida? " + funcionario.getCargo());
		System.out.println("O funcion�rio � pontual? " + funcionario.getPontual());
	
	funcionario.funf();
	}

}
