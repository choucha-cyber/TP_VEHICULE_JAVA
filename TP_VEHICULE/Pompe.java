package TP_VEHICULE;

import java.util.Scanner;

public class Pompe {
	
	//attributs
	 protected String typeCarburant;
	 protected int contenance;
	 protected String contenu;
	 
	 public  Pompe(){
		 //retourne un nombre de litre retiré de la pompe (décrémente valeur return rempliReservoir)
		 int valeurPompe = 0;
		 valeurPompe -= rempliReservoir();
		 
	 }
	 
	 public static double rempliReservoir() {
		//retourne un nombre de litre versé dans le reservoir
		 Scanner sc= new Scanner(System.in);
		 int result = sc.nextInt();
		 return result;
		 
	 }

}
