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
        boundary.setControlJeuPirate(this);
        Joueur[] joueurs = jeu.getJoueurs();
        controlActiverCase.setPlateau(jeu.getPlateau());
        controlVerifierFin.setJoueurs(joueurs[0], joueurs[1]);
        controlDeplacer.setJeu(jeu);
        indiquerTour();
    }
    
    public void indiquerTour() {
    	boundary.afficherJoueur(jeu.getJoueurCourant());
        boundary.setILancerDe(controlDeplacer);     
        boundary.lancerDes();
    }
    
    public void finLancerDes(int nbPas) {
    	boundary.setIDeplacerPirate(controlDeplacer);
        boundary.deplacerPirate(nbPas); 
    }
    
    public void finDeplacement(int newCase) {
    	 boundary.setIActiverCase(controlActiverCase);
         boundary.activerCase(newCase, jeu.getJoueurCourant());
         boolean fin = controlVerifierFin.verifierFin();
         
         if (!fin){
             jeu.changerTour();
             indiquerTour();
         }
         else {
        	 boundary.setIVerifierFin(controlVerifierFin);
             boundary.annoncerVainqueur();    	
             
         }
 
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
