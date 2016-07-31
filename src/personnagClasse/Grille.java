package personnagClasse;

import java.util.*;

public class Grille {

	// attribut

	private int nbligne;
	private int nbcolone;
	private char[][] grille;

	// constructeur

	public Grille(int l, int c) {

		nbligne = l;
		nbcolone = c;
		grille = new char[nbligne][nbcolone];

		for (int i = 0; i < nbligne; i++) {

			for (int j = 0; j < nbcolone; j++) {

				grille[i][j] = 'x';

			}

		}

	}

	// accesseurs

	// methode

	public void affiche(){
		
		System.out.println();
		
	for(int i = 0; i < nbligne; i++) {
			
			for(int j = 0; j < nbcolone; j++){
				
				System.out.print(" | " + grille[i][j]);
				
			}
		
		System.out.println(" | ");
		
	}
	
	
	System.out.println();
	
	} 
	
	
	//methode deplacer
	
	//positionner des objet
}







