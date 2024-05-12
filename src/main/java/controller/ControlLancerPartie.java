
package controller;

import entity.Jeu;
import entity.Joueur;

public class ControlLancerPartie {
	
	
	
    public Jeu initialiserJeu() {
    // Création des joueurs
	Joueur joueur1 = new Joueur("joueur1");
	Joueur joueur2 = new Joueur("joueur2");
	        
	Joueur[] joueurs = {joueur1, joueur2};
	
        
	        
	return new Jeu(joueurs);
    }

	
	
	
	
    
}
