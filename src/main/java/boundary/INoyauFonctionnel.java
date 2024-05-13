package boundary;

import entity.Joueur;

public interface INoyauFonctionnel {
	public void finLancerDes();
	
	public void verifierDeplacement(int caseArrivee,Joueur joueurCourant,int nbPas);
	
    
}
