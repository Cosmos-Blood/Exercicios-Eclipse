package Aula05.Exercicio01;

public class Exercicio01Cliente {

	public static void main(String[] args) {
		
		Cliente client1 = new Cliente();
		
		client1.setNome("Guilherme Silva Campos");
		client1.setCpf("40028922");
		client1.setIdade(18);
		client1.setCelular(40028922);

		System.out.println("Nome: " + client1.getNome());
		System.out.println("CPF: " + client1.getCpf());
		System.out.println("Idade: " + client1.getIdade());
		System.out.println("Número de celular: " + client1.getCelular());
	
		client1.cadastro();
	
	}

}
