package entity;


public class Choix {
    private String reponse;
    private String reaction;
    
    private int effetVie;

    public Choix(String reponse, String reaction, int effetVie) {
        this.reponse = reponse;
        this.reaction = reaction;
        this.effetVie = effetVie;
    }

    public String getReponse() {
        return reponse;
    }

    public String getReaction() {
        return reaction;
    }

    public int getEffetVie() {
        return effetVie;
    }

    
   
}
