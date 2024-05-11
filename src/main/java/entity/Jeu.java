package entity;

public class Jeu {
    private Joueur [] joueurs = new Joueur[2];
    private int idJoueurCourant = 0;

    public Jeu(Joueur joueur1, Joueur joueur2) {
        joueurs[0] = joueur1;
        joueurs[1] = joueur2;
    }
    
    
   public Joueur getJoueurCourant(){
       return joueurs[idJoueurCourant];
   }
}
