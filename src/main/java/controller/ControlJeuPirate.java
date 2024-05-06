package controller;
import entity.*;
import boundary.*;

public class ControlJeuPirate {
    ControlActiverCase controlActiverCase;
    ControlDeplacer controlDeplacer;
    ControlLancerPartie controlLancerPartie;
    ControlVerifierFin controlVerifierPartie;
    
    Jeu jeu;
    
    IBoundary boundary;

    public ControlJeuPirate(ControlActiverCase controlActiverCase, ControlDeplacer controlDeplacer, ControlLancerPartie controlLancerPartie, ControlVerifierFin controlVerifierPartie, Jeu jeu, IBoundary boundary) {
        this.controlActiverCase = controlActiverCase;
        this.controlDeplacer = controlDeplacer;
        this.controlLancerPartie = controlLancerPartie;
        this.controlVerifierPartie = controlVerifierPartie;
        this.jeu = jeu;
        this.boundary = boundary;
    }
    
    public void jouer(){
        //Indiquer au joueur que ces son tour
        //boundary.afficherJoueur(jeu.getJoueurCourant());
        //proposer au joueur de ce deplacer
        //numCase = boundary.deplacerJoueur(jeu.getJoueurCourant());
        //activer la case
        //boundary.activerCase(jeu.getCase(numCase));
        //verifier la fin
        //ControlVerifierFin.verifierFin(); + if
        //changer le tour ou annoncer la fin
     
        
    }
    
}
