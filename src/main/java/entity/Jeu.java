package entity;

public class Jeu {
    private Joueur [] joueurs;
    private int idJoueurCourant = 0;
    
    private Plateau plateau = new Plateau(5, 10);
    
    public Jeu(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public Plateau getPlateau() {
        return plateau;
    }
    
   public Joueur getJoueurCourant(){
       return joueurs[idJoueurCourant];
   }
   
   public void changerTour(){
       idJoueurCourant = (idJoueurCourant + 1)%2;
   }
}
