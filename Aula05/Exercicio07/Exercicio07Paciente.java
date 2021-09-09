package Aula05.Exercicio07;

public class Exercicio07Paciente {
	
	public static void main (String []args) {
		
		Paciente hospital = new Paciente();
		
		hospital.setHospital("Santa Generation");
		hospital.setNome("Claúdio Ferreira");
		hospital.setComorbidade("Febre de 95º");
		hospital.setRemedio("Xarope da Rochelle");
		
		System.out.println("Em qual hospital o paciente está? " + hospital.getHospital());
		System.out.println("Nome do paciente: " +  hospital.getNome());
		System.out.println("Qual a comorbidade? " + hospital.getComorbidade());
		System.out.println("Medicamente receitado? " + hospital.getRemedio());
		
		hospital.medice();
	}

}
