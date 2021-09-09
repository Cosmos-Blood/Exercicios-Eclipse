package Aula05.Exercicio02;

public class Aeroporto {
	
	private int cadeiras;
	private int cadeirasVagas;
	private int passageiros;
	private String piloto;
	private String coPiloto;
	public int getCadeiras() {
		return cadeiras;
	}
	public void setCadeiras(int cadeiras) {
		this.cadeiras = cadeiras;
	}
	public int getCadeirasVagas() {
		return cadeirasVagas;
	}
	public void setCadeirasVagas(int cadeirasVagas) {
		this.cadeirasVagas = cadeirasVagas;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getCoPiloto() {
		return coPiloto;
	}
	public void setCoPiloto(String coPiloto) {
		this.coPiloto = coPiloto;
	}

	void info() {
		System.out.println("O relatório do voo: ");
	}

}
