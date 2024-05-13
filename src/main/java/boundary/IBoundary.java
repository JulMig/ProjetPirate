
package boundary;

import controller.*;
import entity.Joueur;

public interface IBoundary {
    
        public void setControlJeuPirate(ControlJeuPirate controljeuPirate);

	public void afficherJoueur(Joueur joueurCourant);

	public void setILancerDe(ILancerDe iLancerDe);

	public void setIVerifierFin(IVerifierFin iVerfierFin);

	public void setIActiverCase(IActiverCase iActiverCase);

	public void lancerDes();

	public void setIDeplacerPirate(IDeplacerPirate iDeplacerPirate);

	public void deplacerPirate(Joueur joueurCourant, int nbPas);

	public void annoncerVainqueur();

	public void activerCase(int numCase, Joueur joueurCourant);

	

}
