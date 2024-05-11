package controller;
import entity.*;
import boundary.*;

public class ControlJeuPirate {
    ControlActiverCase controlActiverCase;
    ControlDeplacer controlDeplacer;
    ControlLancerPartie controlLancerPartie;
    ControlVerifierFin controlVerifierFin;
    
    Jeu jeu;
    
    IBoundary boundary;

    public ControlJeuPirate(ControlActiverCase controlActiverCase, ControlDeplacer controlDeplacer, ControlLancerPartie controlLancerPartie, ControlVerifierFin controlVerifierFin, IBoundary boundary) {
        this.controlActiverCase = controlActiverCase;
        this.controlDeplacer = controlDeplacer;
        this.controlLancerPartie = controlLancerPartie;
        this.controlVerifierFin = controlVerifierFin;
        this.boundary = boundary;
    }
    
    public void jouer(){
        //Indiquer au joueur que ces son tour
        
        boundary.afficherJoueur(jeu.getJoueurCourant());
        //proposer au joueur de ce deplacer
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
        controlJeuPirate.jouer();
        
    }
    
}
