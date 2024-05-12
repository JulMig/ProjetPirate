package controller;

import entity.*;

public class ControlVerifierFin implements IVerifierFin {
    Joueur  joueur1;
    Joueur joueur2;
    
    
    public void setJoueurs(Joueur joueur1, Joueur joueur2){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }
    
    public boolean verifierFin(){
    	
    	
        boolean joueur1_nul = joueur1.getVie() == 0;
        boolean joueur2_nul = joueur2.getVie() == 0;
        
        if (joueur1_nul || joueur2_nul) {
            return true; 
        } else if (joueur1.getPositionCourante() == 30 || joueur2.getPositionCourante() == 30) {
            return true; 
        }
        
        return false; // La partie continue
    }
    
    public String donnerVainqueur(){
        if (joueur1.getVie() == 0 || joueur2.getPositionCourante() == 30){
            return joueur2.getNom();
        } else {
            return joueur1.getNom();
        }
    }
}
