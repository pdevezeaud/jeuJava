package personnagClasse;

public class TestGrille {
	
	public static void main (String[] args) {
	
	//on crée la grille
			Grille g1 = new Grille(18,18);
								
			// on place le joueur
			
			// ligne 3 colonne 3 representé par un j
					
			g1.placerJoueur(3, 5, 'J');
			
			
			//placement joueur, Objet, Monstre
			g1.placerJoueur(8, 2, 'O');
			g1.placerJoueur(7, 4, 'O');
			g1.placerJoueur(1, 1, 'M');
			g1.placerJoueur(10,7,'M');
			g1.placerJoueur(11,2,'M');
			
			System.out.println("Debut des test\n");
			System.out.println(g1.getCase(3, 5) + " = j\n");
			System.out.println(g1.getCase(1, 1) + " = M\n");
			System.out.println(g1.getCase(15, 15) + " = .\n");
			
			
	}

}
