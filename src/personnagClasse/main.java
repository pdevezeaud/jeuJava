package personnagClasse;

public class main {

	public static void main (String[] args) {
		
		
		//on crée la grille
		Grille g1 = new Grille(10,15);
							
		// on place le joueur
		
		// ligne 3 colonne 3 representé par un j
				
		g1.placerJoueur(3, 3, 'j');
		
		
		//placement joueur, Objet, Monstre
		g1.placerJoueur(8, 2, 'O');
		g1.placerJoueur(7, 4, 'O');
		g1.placerJoueur(1, 1, 'M');
		
		//affichage
		
		System.out.println("J = Joueur\nO = Objet\nM = Monstre\n. = Vide");
		g1.affiche();
		

	}

}
