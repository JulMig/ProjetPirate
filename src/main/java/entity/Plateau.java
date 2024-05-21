package entity;

import java.util.Random;

public class Plateau {
    private CaseNormal[] cases = new CaseNormal[30];

    public Plateau(int nbBombe, int nbQCM) {
        int nbCaseNormal = 28 - (nbBombe + nbQCM);
        Random random = new Random();
        int typeCase;
        cases[0] = new CaseNormal();
        cases[29] = new CaseNormal();
        for (int i = 1; i < 29; i++){
            
            do{
                typeCase = random.nextInt(0, 3);
            }while((typeCase == 0 && nbCaseNormal == 0)||(typeCase == 1 && nbBombe == 0)||(typeCase == 2 && nbQCM == 0));
            
            switch (typeCase){
                case 0 : {
                    cases[i] = new CaseNormal();
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
    
    public CaseNormal getCase(int numCase){
        return cases[numCase-1];
    }
    
    
    
}
