
package controller;

import entity.Jeu;
import entity.Joueur;
import java.awt.image.BufferedImage;

public class ControlLancerPartie {
	
	
	
    public Jeu initialiserJeu(String j1Name, String j2Name, BufferedImage j1, BufferedImage j2) {
    // Création des joueurs
	Joueur joueur1 = new Joueur(1,j1Name,j1);
	Joueur joueur2 = new Joueur(2,j2Name,j2);
	        
	Joueur[] joueurs = {joueur1, joueur2};
	
        
	        
	return new Jeu(joueurs);
    }

	
	
	
	
    
}
