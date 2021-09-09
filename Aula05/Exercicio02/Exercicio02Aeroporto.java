package Aula05.Exercicio02;

public class Exercicio02Aeroporto {
	
	public static void main (String [] args ) {
		
		Aeroporto aviao = new Aeroporto();
		
		aviao.setPiloto("Gabriel Bohn");
		aviao.setCoPiloto("Corki");
		aviao.setPassageiros(628);
		aviao.setCadeiras(720);
		aviao.setCadeirasVagas(92);
		
		System.out.println("Nome do Piloto: " + aviao.getPiloto());
		System.out.println("Nome do Co-Piloto: " + aviao.getCoPiloto());
		System.out.println("Quantidade de passageiros: " + aviao.getPassageiros());
		System.out.println("Cadeiras máximas no avião: " + aviao.getCadeiras());
		System.out.println("Cadeiras ainda disponíveis: " + aviao.getCadeirasVagas());
	
		aviao.info();
	}

}
