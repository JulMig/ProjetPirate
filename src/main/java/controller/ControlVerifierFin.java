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
        
        if (joueur1_nul) {
            System.out.println(joueur2.getNom() + " a gagné la partie !");
            return true; 
        } else if (joueur2_nul) {
            System.out.println(joueur1.getNom() + " a gagné la partie !");
            return true; 
        }
        
        
        if (joueur1.getPositionCourante() == 30) {
            System.out.println(joueur1.getNom() + " a trouvé la barque et devient le capitaine !");
            return true; 
        } else if (joueur2.getPositionCourante() == 30) {
            System.out.println(joueur2.getNom() + " a trouvé la barque et devient le capitaine !");
            return true; 
        }
        
        return false; // La partie continue
    }
}
