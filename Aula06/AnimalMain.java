package Aula06;

import java.util.Scanner;

public class AnimalMain {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		Cachorro dog = new Cachorro();
		System.out.println("Digite o nome do cachorro: ");
		dog.setNome(ler.nextLine());
		System.out.println("Qual a idade do " + dog.getNome() + " ? ");
		dog.setIdade(ler.nextInt());
		ler.nextLine();
		dog.setSom("Woof!");
		System.out.println(dog.getNome() + ": " + dog.getSom());
		System.out.print(dog.getNome() + " ");
		dog.correndo();
		
		
		System.out.println("\n••••••••••••••••••••••••••••");
		Cavalo horse = new Cavalo();
		System.out.println("Digite o nome do cavalo: ");
		horse.setNome(ler.nextLine());
		System.out.println("Qual a idade do " + horse.getNome() + " ?");
		horse.setIdade(ler.nextInt());
		ler.nextLine();
		horse.setSom("iiirrrrí");
		System.out.println(horse.getNome() + ": " + horse.getSom());
		System.out.print(horse.getNome() + " ");
		horse.galopa();
		
		System.out.println("\n••••••••••••••••••••••••••••");
		Preguiça sloth = new Preguiça();
		System.out.println("Digite o nome da preguiça: ");
		sloth.setNome(ler.nextLine());
		System.out.println("Qual a idade da " + sloth.getNome() + " ? ");
		sloth.setIdade(ler.nextInt());
		sloth.setSom("aaaah");
		System.out.println(sloth.getNome() + ": " + sloth.getSom());
		System.out.print(sloth.getNome() + " ");
		sloth.escalando();
		
		ler.close();
	}

}
