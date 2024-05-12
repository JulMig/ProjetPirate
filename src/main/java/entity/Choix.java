package entity;


public class Choix {
    private String reponse;
    private String reaction;
    
    private int effetVie;
    private int effetDeplacement;

    public Choix(String reponse, String reaction, int effetVie, int effetDeplacement) {
        this.reponse = reponse;
        this.reaction = reaction;
        this.effetVie = effetVie;
        this.effetDeplacement = effetDeplacement;
    }

    public String getReponse() {
        return reponse;
    }

    public String getReaction() {
        return reaction;
    }

    
   
}
