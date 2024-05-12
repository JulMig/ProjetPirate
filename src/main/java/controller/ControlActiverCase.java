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
    public String getQuestion(int numCase){
        Case c = plateau.getCase(numCase);
        if( c instanceof CaseQCM qcm){
            String question= qcm.getQuestion();
            return question;    
        }
        return "";
    }
    
    public String[] getReponses(int numCase){
        Case c = plateau.getCase(numCase);
        if( c instanceof CaseQCM qcm){
            return qcm.getReponses();    
        }
        return null;
    }
    
    public String playEffect(int numCase, int rep, Joueur joueur){
        Case c = plateau.getCase(numCase);
        if( c instanceof CaseQCM qcm){
            String reaction = qcm.getReaction(rep);
            int effetVie = qcm.getDegat(rep);
            
            if (effetVie > 0){
                gagnerVie(joueur, effetVie);
            } else {
                perdreVie(joueur, -effetVie);
            }
            
            return reaction;    
        }
        return "";
    }
}
