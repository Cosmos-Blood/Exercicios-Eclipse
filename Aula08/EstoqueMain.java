package Aula08;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueMain {
	public static void main (String [] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList <Estoque> catalogo = new ArrayList <>();
	int numero = 0;
	
	while(numero != 5) {
		System.out.println("O que será feito no estoque? \n1-Acrescentar um item \n2- Remover um item \n3- Atualizar lista "
				+ "\n4- Apresentar lista atual \n5- Sair");
		numero = scan.nextInt();
		switch (numero) {
		
		case 1: 
			String nomeItem;
			System.out.println("Digite o nome do item: ");
			nomeItem = scan.nextLine();
			
			double valorItem = 0;
			System.out.println("Digite o valor");
			valorItem = scan.nextInt();
			
			catalogo.add(new Estoque(nomeItem, valorItem));
			break;
		
		case 2:
			System.out.println("Digite o nome do item a ser removido: ");
			nomeItem = scan.nextLine();
			for (int i = 0; i < catalogo.size(); i++)
			if (catalogo.get(i).getItem().equals(nomeItem)) {
				catalogo.remove(i);
				break;
				
			}
		case 3: 
		}
		
	}
	
	}
}
