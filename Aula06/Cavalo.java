package Aula06;

public class Cavalo extends Animal {

		private String som;

		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}
		public void galopa() {
			System.out.println("cavalga ferozmente!");
		}
}
