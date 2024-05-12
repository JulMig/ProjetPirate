package entity;

import java.util.Random;

public class CaseQCM extends Case{
    private String question;
    private Choix [] choix = new Choix[2];

    public CaseQCM() {
        
        Random random = new Random();
        int question = random.nextInt(0, 4);
        
        switch (question){
            case 0 : {
                
                
                break;
            }
            case 1 : {
                
                
                break;
            }
            case 2 : {
                
                
                break;
            }
            case 3 : {
                
                
                break;
            }
        }
        
    }
    
   
    
}
