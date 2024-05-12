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
        //TODO
        return false;
    }
}
