package entity;

import java.util.Random;

public class Plateau {
    private Case[] cases = new Case[30];

    public Plateau(int nbBombe, int nbQCM) {
        int nbCaseNormal = 30 - (nbBombe + nbQCM);
        Random random = new Random();
        int typeCase;
        for (int i = 0; i < 30; i++){
            
            do{
                typeCase = random.nextInt(0, 3);
            }while((typeCase == 0 && nbCaseNormal == 0)||(typeCase == 1 && nbBombe == 0)||(typeCase == 2 && nbQCM == 0));
            
            switch (typeCase){
                case 0 : {
                    cases[i] = new Case();
                    nbCaseNormal -= 1;
                    break;
                }
                case 1 : {
                    cases[i] = new CaseBombe();
                    nbBombe -= 1;
                    break;
                }
                case 2 : {
                    cases[i] = new CaseQCM();
                    nbQCM -= 1;
                    break;
                }
            }
                 
        }
        
    }
    
    public Case getCase(int numCase){
        return cases[numCase];
    }
    
    
    
}
