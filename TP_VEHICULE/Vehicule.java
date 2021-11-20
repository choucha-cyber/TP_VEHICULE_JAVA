package TP_VEHICULE;

public class Vehicule {

	// mes attributs
	private  String type;
	private  String carburant;
	private int vitesse_max;
	

	// mes constructeurs
	// avec param...
	public Vehicule(String type, String carburant, int vitesse_max) {
		super();
		this.type = type;
		this.carburant = carburant;
		this.vitesse_max = vitesse_max;

	}

	// sans param...
	public Vehicule() {
		super();
	}
	
	//methode test
		public String identifier() {
			return "je suis un véhicule";
		}

	// assesseurs (asessor/mutator)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public int getVitesse_max() {
		return vitesse_max;
	}

	public void setVitesse_max(int vitesse_max) {
		this.vitesse_max = vitesse_max;
	}

	
	public void faire_plein(Pompe pompe) {
		double result = Pompe.rempliReservoir();
	  }


}

/*
 * TP – VEHICULE Créer une classe Véhicule; 2 classes qui en héritent : Voiture
 * et Moto qui vont contenir des méthodes pour retourner :
 * 
 * - le nombre de roues (lié au type de véhicule) - le type de carburant
 * (essence ou diesel) - la vitesse max
 * 
 * • Ajouter un constructeur • Instancier un véhicule de chaque type • Ajouter 2
 * attributs contenanceReservoir et contenuReservoir
 * 
 * • Créer une classe Pompe (à essence) avec 3 attributs : typeCarburant,
 * contenance et contenu • Dans Véhicule, ajouter une méthode fairePlein() qui
 * prend une Pompe en paramètre, qui remplit le réservoir du Véhicule et enlève
 * autant d'essence à la Pompe
 * 
 * • **** bonus : - vérifier qu'on fait le plein à une pompe du même type de
 * carburant que le véhicule
 */