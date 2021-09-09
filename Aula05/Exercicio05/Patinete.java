package Aula05.Exercicio05;

public class Patinete {
	
	private String rodas;
	private String cor;
	private String almofada;
	private String freios;
	public String getRodas() {
		return rodas;
	}
	public void setRodas(String rodas) {
		this.rodas = rodas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAlmofada() {
		return almofada;
	}
	public void setAlmofada(String almofada) {
		this.almofada = almofada;
	}
	public String getFreios() {
		return freios;
	}
	public void setFreios(String freios) {
		this.freios = freios;
	}
	void pati() {
		System.out.println("O patinete que está circulando é: ");
	}

}
