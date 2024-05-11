
package boundary;

import controller.IDeplacerPirate;
import entity.Joueur;
import controller.ILancerDe;

public interface IBoundary {
	
	public void afficherJoueur(Joueur joueurCourant);
	
	public void setILancerDe (ILancerDe iLancerDe);
	
	public int lancerDes();
	
	public void setIDeplacerPirate(IDeplacerPirate iDeplacerPirate);
	
	public int deplacerPirate(Joueur joueurCourant, int nbPas);
	
    
}
