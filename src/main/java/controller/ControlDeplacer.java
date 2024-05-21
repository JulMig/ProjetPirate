package controller;

import entity.*;

public class ControlDeplacer implements IDeplacerPirate, ILancerDe {
    private Jeu jeu;
    
    public int[] LancerDes(){
    	
    	return De.lancerDes(2);
        
    }
    
    public int deplacerPirate(Joueur joueur, int nbPas){
        return joueur.deplacerPirate(nbPas);
        
    }
    public boolean verifierDeplacement(Joueur joueur, int nbPas, int nbPasFait){
        
        return joueur.verifierDeplacement(nbPas, nbPasFait);
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }
    
    public Joueur getJoueurCourant(){
        return jeu.getJoueurCourant();
    }
    
    public int getNouvellePositionJoueurCourant(){
        return jeu.getJoueurCourant().getNbPas();
    }
}
