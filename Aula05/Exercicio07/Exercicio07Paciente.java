package Aula05.Exercicio07;

public class Exercicio07Paciente {
	
	public static void main (String []args) {
		
		Paciente hospital = new Paciente();
		
		hospital.setHospital("Santa Generation");
		hospital.setNome("Cla�dio Ferreira");
		hospital.setComorbidade("Febre de 95�");
		hospital.setRemedio("Xarope da Rochelle");
		
		System.out.println("Em qual hospital o paciente est�? " + hospital.getHospital());
		System.out.println("Nome do paciente: " +  hospital.getNome());
		System.out.println("Qual a comorbidade? " + hospital.getComorbidade());
		System.out.println("Medicamente receitado? " + hospital.getRemedio());
		
		hospital.medice();
	}

}
