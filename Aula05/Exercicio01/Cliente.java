package Aula05.Exercicio01;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private int celular;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}

	void cadastro() {
		System.out.println("O cliente está se registrando na loja... ");
		
	}
		
	
}
