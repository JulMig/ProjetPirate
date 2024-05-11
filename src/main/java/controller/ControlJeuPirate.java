package controller;
import entity.*;
import boundary.*;

public class ControlJeuPirate {
    private ControlActiverCase controlActiverCase;
    private ControlDeplacer controlDeplacer;
    private ControlLancerPartie controlLancerPartie;
    private ControlVerifierFin controlVerifierFin;
    
    private Jeu jeu;
    
    private IBoundary boundary;

    public ControlJeuPirate(ControlActiverCase controlActiverCase, ControlDeplacer controlDeplacer, ControlLancerPartie controlLancerPartie, ControlVerifierFin controlVerifierFin, IBoundary boundary) {
        this.controlActiverCase = controlActiverCase;
        this.controlDeplacer = controlDeplacer;
        this.controlLancerPartie = controlLancerPartie;
        this.controlVerifierFin = controlVerifierFin;
        this.boundary = boundary;
    }
    
    public void initialiserPartie(){
        jeu = controlLancerPartie.initialiserJeu();
        jouer();
    }
    
    private void jouer(){       
        boundary.afficherJoueur(jeu.getJoueurCourant());

        boundary.setILancerDe(controlDeplacer);
        boundary.lancerDes();
        
        //numCase = boundary.deplacerJoueur(jeu.getJoueurCourant());
        //activer la case
        //boundary.activerCase(jeu.getCase(numCase));
        //verifier la fin
        //ControlVerifierFin.verifierFin(); + if
        //changer le tour ou annoncer la fin
     
        
    }
    
    public static void main(String[] args) {
        ControlActiverCase controlActiverCase = new ControlActiverCase();
        ControlDeplacer controlDeplacer = new ControlDeplacer();
        ControlLancerPartie controlLancerPartie = new ControlLancerPartie();
        ControlVerifierFin controlVerifierFin = new ControlVerifierFin();
        
        BoundaryJeuPirate boundary = new BoundaryJeuPirate();
        
        ControlJeuPirate controlJeuPirate = new ControlJeuPirate(controlActiverCase, controlDeplacer, controlLancerPartie, controlVerifierFin, boundary);
        controlJeuPirate.initialiserPartie();
        
    }
    
}
