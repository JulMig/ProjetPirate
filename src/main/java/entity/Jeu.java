package entity;

public class Jeu {
    private Joueur [] joueurs;
    private int idJoueurCourant = 0;

    public Jeu(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }
    
    
   public Joueur getJoueurCourant(){
       return joueurs[idJoueurCourant];
   }
}
