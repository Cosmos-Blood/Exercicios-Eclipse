package Exemplos.Poo.Polimorfismo;

public class AnimalMain {
	
	public static void main (String [] args) {
		IndicadorMetado objeto = new IndicadorMetado();
		
		objeto.animalComendo(new Cachorro());
		objeto.animalComendo(new Pantera());
	}

}
