package Aula05.Exercicio07;

public class Paciente {
	
	private String hospital;
	private String nome;
	private String comorbidade;
	private String remedio;
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComorbidade() {
		return comorbidade;
	}
	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}
	public String getRemedio() {
		return remedio;
	}
	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	
	void medice() {
		System.out.println("O paciente está se tratando...");
	}

}
