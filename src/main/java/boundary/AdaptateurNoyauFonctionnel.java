package boundary;

import java.awt.image.BufferedImage;

import controller.IActiverCase;
import controller.IDeplacerPirate;
import controller.ILancerDe;
import controller.IVerifierFin;
import entity.Joueur;

public class AdaptateurNoyauFonctionnel implements INoyauFonctionnel,IBoundary{
	private IActiverCase iActiverCase;
	private IDeplacerPirate iDeplacerPirate;
	private ILancerDe iLancerDe;
	private IVerifierFin iVerifierFin;
	private IPirates iPirates;

	@Override
	public void afficherJoueur(Joueur joueurCourant) {
		BufferedImage im = joueurCourant.getImage();
		String nomPirate = joueurCourant.getNom();
		
		iPirates.indiquerTour(im, nomPirate);
		
		
	}

	@Override
	public void setILancerDe(ILancerDe iLancerDe) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void setIVerifierFin(IVerifierFin iVerfierFin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIActiverCase(IActiverCase iActiverCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int lancerDes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setIDeplacerPirate(IDeplacerPirate iDeplacerPirate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deplacerPirate(Joueur joueurCourant, int nbPas) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void annoncerVainqueur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activerCase(int numCase, Joueur joueurCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int poserQuestion(int numCase) {
		// TODO Auto-generated method stub
		return 0;
	}

}
