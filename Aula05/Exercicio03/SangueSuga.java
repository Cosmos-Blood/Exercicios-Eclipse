package Aula05.Exercicio03;

public class SangueSuga {
	
	private String celular;
	private String modelo;
	private String android;
	private String tela;
	private String carregador;
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAndroid() {
		return android;
	}
	public void setAndroid(String android) {
		this.android = android;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	public String getCarregador() {
		return carregador;
	}
	public void setCarregador(String carregador) {
		this.carregador = carregador;
	}
	
	void especificacoes() {
		System.out.println("As especifícações do celular é: ");
	}
}
