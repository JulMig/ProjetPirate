
package boundary;

import entity.Joueur;
import controller.ILancerDe;

public interface IBoundary {
	
	public String afficherJoueur(Joueur joueurCourant);
	
	public void setILancerDe (ILancerDe IDeplacerPirate);
	
	public int lancerDes();
	
	public void setDeplacerPirate(ILancerDe IDeplacerPirate);
	
	
	
    
}
