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

				grille[i][j] = '.';

			}

		}

	}

	// accesseurs
	// recupere le positionnement

	public char getCase(int l, int c) {

		return grille[l - 1][c - 1];
	}

	// methode

	public void affiche() {

		System.out.println();

		for (int i = 0; i < nbligne; i++) {

			for (int j = 0; j < nbcolone; j++) {

				System.out.print(" | " + grille[i][j]);

			}

			System.out.println(" | ");

		}

		System.out.println();

	}

	// methode deplacer

	public void placerJoueur(int l, int c, char t) {

		l = l - 1;
		c = c - 1; // pour positionner en 0,0

		// on test pour savoir si l'on sort de la grille
		if (l < 0 || c < 0 || l > nbligne || c > nbcolone) {

			System.out.println("Erreur de placement !!");

		}

		if (grille[l][c] == '.') {
			grille[l][c] = t; // represente le joueur pour l'insant

		} else {
			System.out.println("Erreur, cette zone n'est pas vide !");
		}
	}

	// DEPLACER DES OBJETS

public void deplacerH(){
	
		
	     char tmp;
	
	      for(int i=0; i < nbligne; i++){
			
			for(int j = 0; j < nbcolone; j++){
				
				if(grille[i][j] == 'J'){ 
					//SI GRILLE == J  ALORS
					if(i-1 >= 0){
						
						tmp = grille[i][j];       //ON COPIE LE PERSO
						grille[i][j] = '.';       //ON VIDE LA CASE
						grille[i][j] = tmp;       //ON DEPLACE LE PERSO      9/85   
						
				}
										
				}
				
			}
		}
	
		
		
		if(grille[][] == '.'){
		grille[][] = t;     //represente le joueur pour l'insant
			
		}
		else{
			System.out.println("Erreur, cette zone n'est pas vide !");
		}
	}
}
