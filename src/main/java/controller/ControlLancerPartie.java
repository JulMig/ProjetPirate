
package controller;

import entity.Jeu;
import entity.Joueur;

public class ControlLancerPartie {
	
	
	
    public Jeu initialiserJeu() {
    // Création des joueurs
	Joueur joueur1 = new Joueur(1,"joueur1",null);
	Joueur joueur2 = new Joueur(2,"joueur2",null);
	        
	Joueur[] joueurs = {joueur1, joueur2};
	
        
	        
	return new Jeu(joueurs);
    }

	
	
	
	
    
}
