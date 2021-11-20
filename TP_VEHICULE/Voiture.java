package TP_VEHICULE;

public class Voiture {
	
	protected String type;
	protected String carburant;
	protected int vitesse_max;

	public Voiture(String type, String carburant, int vitesse_max) {
		this.type = type;
		this.carburant = carburant;
		this.vitesse_max = vitesse_max;
	}
	
	public void afficher() {
		System.out.println("le type de vehicule est: " + type + " et utilise un carburant de type: " + carburant
				+ " avec une vitesse maximale de: " + vitesse_max + " km/h");
	}
	


}
