package Aula05.Exercicio03;

public class Exercicio03SangueSuga {
	public static void main (String [] args) {
		
		SangueSuga celular = new SangueSuga();
		
		celular.setCelular("Smartphone SangueSuga");
		celular.setModelo("Galaxy S111");
		celular.setAndroid("Android 71");
		celular.setTela("Amoled");
		celular.setCarregador("kkkkkkkkkk");
	
		System.out.println("Qual a marca: " + celular.getCelular());
		System.out.println("Qual o modelo: " + celular.getModelo());
		System.out.println("Qual o android de fábrica: " + celular.getAndroid());
		System.out.println("Tipo de tela: " + celular.getTela());
		System.out.println("Possui carregador? " + celular.getCarregador());

		celular.especificacoes();
	}

}
