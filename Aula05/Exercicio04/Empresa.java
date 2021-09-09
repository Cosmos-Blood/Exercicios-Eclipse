package Aula05.Exercicio04;

public class Empresa {
	
	private String empresa;
	private String nome;
	private String cargo;
	private String ensino;
	private String pontual;
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEnsino() {
		return ensino;
	}
	public void setEnsino(String ensino) {
		this.ensino = ensino;
	}
	public String getPontual() {
		return pontual;
	}
	public void setPontual(String pontual) {
		this.pontual = pontual;
	}
	
	void funf() {
		System.out.println("O atual relatório sobre o funcionário é: " );
	}

}
