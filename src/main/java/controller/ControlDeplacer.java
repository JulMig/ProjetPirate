package controller;

import entity.De;
import entity.Joueur;

public class ControlDeplacer implements IDeplacerPirate, ILancerDe {
	
    public int[] LancerDes(){
    	
    	return De.lancerDes(2);
        
    }
    
    public int deplacerPirate(Joueur joueur, int nbPas){
        return joueur.deplacerPirate(nbPas);
        
    }
    public boolean verifierDeplacement(Joueur joueur, int nbPas, int nbPasFait){
        
        return joueur.verifierDeplacement(nbPas, nbPasFait);
    }
}
