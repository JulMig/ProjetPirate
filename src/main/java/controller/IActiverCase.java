package controller;
import entity.*;

public interface IActiverCase {
    public int perdreVie(Joueur j, int nbVie);
    
    public int gagnerVie(Joueur j, int nbVie);
    
    public int activerBombe(Joueur j, int numCase);
    
    public TypeCase getTypeCase(int numCase);
    
    public String getQuestion(int numCase);
    
    public String[] getReponses(int numCase);
    
    public String playEffect(int numCase, int rep, Joueur joueur);
}
