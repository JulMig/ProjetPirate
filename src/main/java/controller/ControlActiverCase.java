package controller;

import entity.*;

public class ControlActiverCase implements IActiverCase {
    private Plateau plateau;

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }
    
    public int perdreVie(Joueur j, int nbVie){
        j.perdreVie(nbVie);
        return j.getVie();
    }
    
    public int gagnerVie(Joueur j, int nbVie){
        j.gagnerVie(nbVie);
        return j.getVie();
    }
    
    public TypeCase getTypeCase(int numCase){
        Case c = plateau.getCase(numCase);
        
        if (c instanceof CaseBombe){
            return TypeCase.BOMBE;
        } else if (c instanceof CaseQCM){
            return TypeCase.QCM;
        }
        
        return TypeCase.NORMAL;
    }
    
    public int activerBombe(Joueur j, int numCase){
        Case c = plateau.getCase(numCase);
        int vieRestante = 0;
        if (c instanceof CaseBombe bombe){
            vieRestante = perdreVie(j, bombe.getDegat());
        }
        return vieRestante;
        
    }
    public String qcm(int numCase){
        Case c = plateau.getCase(numCase);
        if( c instanceof CaseQCM qcm){
            String question= qcm.getQuestion();
        return question;    
        }
    }
}
