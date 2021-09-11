package Aula07.Exercicio01;

import java.util.Scanner;

public class AnimalMain {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		MetodosAnimais objeto = new MetodosAnimais();
		
	
		Cachorro dog = new Cachorro();
		System.out.println("Digite o nome do cachorro: ");
		dog.setNome(ler.nextLine());
		System.out.println("Qual a idade do " + dog.getNome() + "? ");
		dog.setIdade(ler.nextInt());
		ler.hasNextLine();
		System.out.print(dog.getNome());
		objeto.sons(new Cachorro());
		System.out.print(dog.getNome());
		objeto.movendo(new Cachorro());
		
		System.out.println("\n>•••••••••••••••••••••••••••••••••••••••••••<");
		
		Cavalo horse = new Cavalo();
		System.out.println("Digite o nome do cavalo: ");
		horse.setNome(ler.next());
		System.out.println("Qual a idade do " + horse.getNome() + "? ");
		horse.setIdade(ler.nextInt());
		ler.nextLine();
		System.out.print(horse.getNome());
		objeto.sons(new Cavalo());
		System.out.print(horse.getNome());
		objeto.movendo(new Cavalo());
		
		System.out.println("\\n>•••••••••••••••••••••••••••••••••••••••••••<");
		
		Preguiça sloth = new Preguiça();
		System.out.println("Digite o nome da preguiça: ");
		sloth.setNome(ler.nextLine());
		System.out.println("Qual a idade de " + sloth.getNome() + "? ");
		sloth.setIdade(ler.nextInt());
		ler.nextLine();
		System.out.print(sloth.getNome());
		objeto.sons(new Preguiça());
		System.out.print(sloth.getNome());
		objeto.movendo(new Preguiça());
		
		ler.close();
	}

}
