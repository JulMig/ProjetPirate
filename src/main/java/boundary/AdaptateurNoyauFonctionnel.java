package boundary;

import java.awt.image.BufferedImage;
import java.util.ResourceBundle.Control;


import controller.ControlJeuPirate;
import controller.IActiverCase;
import controller.IDeplacerPirate;
import controller.ILancerDe;
import controller.IVerifierFin;
import entity.Joueur;
import entity.TypeCase;

public class AdaptateurNoyauFonctionnel implements INoyauFonctionnel, IBoundary {
	private IActiverCase iActiverCase;
	private IDeplacerPirate iDeplacerPirate;
	private ILancerDe iLancerDe;
	private IVerifierFin iVerifierFin;
	private IPirates iPirates;
	private ControlJeuPirate controlJeuPirate;

	@Override
	public void afficherJoueur(Joueur joueurCourant) {
		BufferedImage im = joueurCourant.getImage();
		String nomPirate = joueurCourant.getNom();
                System.out.println(controlJeuPirate);
		iPirates.indiquerTour(im, nomPirate);
	}

	@Override
	public void setILancerDe(ILancerDe iLancerDe) {
		this.iLancerDe = iLancerDe;

	}

	@Override
	public void setIVerifierFin(IVerifierFin iVerfierFin) {

		this.iVerifierFin = iVerfierFin;

	}

	@Override
	public void setIActiverCase(IActiverCase iActiverCase) {

		this.iActiverCase = iActiverCase;
	}

	@Override
	public void lancerDes() {
		iPirates.debloquerDes();

	}

	@Override
	public void finLancerDes() {
		int[] des = iLancerDe.LancerDes();
		this.iLancerDe = null;
		iPirates.afficherDes(des[0], des[1]);
		controlJeuPirate.finLancerDes(des[0] + des[1]);
	}

	@Override
	public void setIDeplacerPirate(IDeplacerPirate iDeplacerPirate) {
		this.iDeplacerPirate = iDeplacerPirate;

	}
        
        

	@Override
	public void deplacerPirate(int nbPas) {
            Joueur joueurCourant = iDeplacerPirate.getJoueurCourant();
            iPirates.deplacerPirate(joueurCourant.getId());
	}

	@Override
	public void annoncerVainqueur() {
		iPirates.annoncerVainqueur(iVerifierFin.donnerVainqueur());
		this.iVerifierFin = null;

	}

	@Override
	public void activerCase(int numCase, Joueur joueurCourant) {
		TypeCase typeCase = iActiverCase.getTypeCase(numCase);

		switch (typeCase) {
		case NORMAL: {
			iPirates.caseNormale();
			break;
		}
		case BOMBE: {
			
			int vie = iActiverCase.activerBombe(joueurCourant, numCase);
			iPirates.caseBombe(vie,joueurCourant);
			break;
		}
		case QCM: {
			String[] reponses = iActiverCase.getReponses(numCase);
			int rep = iPirates.poserQuestion(numCase,iActiverCase.getQuestion(numCase),reponses[0],reponses[1]);
			String effect = (iActiverCase.playEffect(numCase, rep, joueurCourant));
			iPirates.caseQuestion(effect, joueurCourant.getVie(), joueurCourant);
			break;
		}
		}

		iActiverCase = null;

	}

        @Override
    public void setControlJeuPirate(ControlJeuPirate controlJeuPirate) {
        this.controlJeuPirate = controlJeuPirate;
    }
        

    @Override
    public boolean verifierDeplacement(int caseArrivee) {
            Joueur joueurCourant = iDeplacerPirate.getJoueurCourant();
            int nbPas = iDeplacerPirate.getNouvellePositionJoueurCourant();
            boolean deplacement = iDeplacerPirate.verifierDeplacement(joueurCourant, nbPas, caseArrivee);
                
            if (!deplacement) {
                    deplacerPirate(nbPas);
            } else {
                    iPirates.bloquerJetons();
                    controlJeuPirate.finDeplacement(iDeplacerPirate.deplacerPirate(joueurCourant, nbPas));
                    this.iDeplacerPirate = null;
            }
            return deplacement;
    }
        
    public void setiPirates(IPirates iPirates) {
        this.iPirates = iPirates;
    }
        
        
}
