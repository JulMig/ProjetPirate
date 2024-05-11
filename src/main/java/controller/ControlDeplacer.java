package controller;

import entity.De;
import entity.Joueur;

public class ControlDeplacer implements IDeplacerPirate, ILancerDe {
	
    public int[] LancerDes(){
    	
    	return De.lancerDes(2);
        
    }
    
    public int deplacerPirate(Joueur joueur){
        //TODO
        return 0;
    }
    public boolean verifierDeplacement(Joueur joueur){
        //TODO
        return true;
    }
}
