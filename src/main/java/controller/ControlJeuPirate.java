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
        Joueur[] joueurs = jeu.getJoueurs();
        controlVerifierFin.setJoueurs(joueurs[0], joueurs[1]);
        jouer();
    }
    
    private void jouer(){
        
        boolean fin;
        
        do {
            boundary.afficherJoueur(jeu.getJoueurCourant());

            boundary.setILancerDe(controlDeplacer);
            int nbPas = boundary.lancerDes();
        
            boundary.setIDeplacerPirate(controlDeplacer);
            boundary.deplacerPirate(jeu.getJoueurCourant(), nbPas);
            
            //activer la case
            //boundary.activerCase(jeu.getCase(numCase));
            //verifier la fin
            
            fin = controlVerifierFin.verifierFin();
            if (!fin){
                jeu.changerTour();
            }
        }while (!fin);
        boundary.setIVerifierFin(controlVerifierFin);
        boundary.annoncerVainqueur();
        
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
