package TP_VEHICULE;

public class Main {

	public static void main(String[] args) {
		// Instanciation avec string, string, int
		Voiture bentley = new Voiture("4 roues", "diesel", 250);
	
		bentley.afficher();
		
		Moto bugatti = new Moto("2 roues", "essence", 210);
		bugatti.afficher();
		

	}

}
