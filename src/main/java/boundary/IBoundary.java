
package boundary;

import controller.*;
import entity.Joueur;

public interface IBoundary {
	
	public void afficherJoueur(Joueur joueurCourant);
	
	public void setILancerDe (ILancerDe iLancerDe);
        
        public void setIVerifierFin(IVerifierFin iVerfierFin);
        
        public void setIActiverCase(IActiverCase iActiverCase);
	
	public int lancerDes();
	
	public void setIDeplacerPirate(IDeplacerPirate iDeplacerPirate);
	
	public int deplacerPirate(Joueur joueurCourant, int nbPas);
	
        public void annoncerVainqueur();
        
        public void activerCase(int numCase, Joueur joueurCourant);
        
        public int poserQuestion(int numCase);
        
}
