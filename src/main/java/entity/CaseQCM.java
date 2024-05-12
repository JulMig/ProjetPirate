package entity;

import java.util.Random;

public class CaseQCM extends Case{
    private String question;
    private Choix [] choix = new Choix[2];

    public CaseQCM() {
        
        Random random = new Random();
        int questionNum = random.nextInt(0, 4);
        
        switch (questionNum){
            case 0 : {
                question = "2 chemins s'offrent à vous :";
                choix[0] = new Choix("aller à gauche","Ce chemin était tranquille",0);
                choix[1] = new Choix("aller à droite","Vous vous êtes perdu, vous mourrez de faim",-5);
                break;
            }
            case 1 : {
                question = "Vous voyez un nid de perroquet non surveillé ?";
                choix[0] = new Choix("Faire cuire un oeuf","On dirait bien que les parents on tout vue...",-2);
                choix[1] = new Choix("Passer son chemin","Sage décision",0);
                break;
            }
            case 2 : {
                question = "Un coffre est remplis de bouteilles différente.";
                choix[0] = new Choix("Boire du rhum","On dirait bien que la boisson à un effet inattendu sur vous !",4);
                choix[1] = new Choix("Boire du coca","Avez vous déjà oublié votre allergie ? ",-3);
                break;
            }
            case 3 : {
                question = "Une vielle dame louche vous arrête et demande pourquoi voulait-vous gagner ?";
                choix[0] = new Choix("Pour le navire !","Vous êtes d'un ennuie...",0);
                choix[1] = new Choix("Pour être capitaine !","Vous êtes un leader né, j'adore ça !",2);
                break;
            }
        }
        
    }

    public String getQuestion() {
        return question;
    }
    
    public String[] getReponses(){
        String[] reponses = new String[2];
        reponses[0] = choix[0].getReponse();
        reponses[1] = choix[1].getReponse();
        
        return reponses;
    }
    
    public String getReaction(int num){
        return choix[num].getReaction();
    }
    
    public int getDegat(int num){
        return choix[num].getEffetVie();
    }
    
   
    
}
