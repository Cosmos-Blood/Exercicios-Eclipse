package Aula05.Exercicio06;

public class Banco {

	private String banco;
	private String conta;
	private String operacao;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	void operation() {
		System.out.println("O processo efetuado: ");
	}
}
