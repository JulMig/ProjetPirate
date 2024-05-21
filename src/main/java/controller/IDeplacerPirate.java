package controller;

import entity.*;


public interface IDeplacerPirate {
    public int deplacerPirate(Joueur joueur, int nbPas);
    public boolean verifierDeplacement(Joueur joueur, int nbPas, int nbPasFait);
    public Joueur getJoueurCourant();
}
