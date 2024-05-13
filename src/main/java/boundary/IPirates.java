package boundary;

import java.awt.image.BufferedImage;

import entity.*;

public interface IPirates {
    
	public void indiquerTour(BufferedImage image, String nomPirate);
	
	public void debloquerDes();
	
	public void afficherDes(int val1,int val2);
	
	public void debloquerDeplacement(int caseCourante,Joueur joueur);
	
	public void bloquerJetons();
	
	public void deplacerPirate(Joueur joueurCourant,int nbPas);
	
	public void caseNormale();
	
	public void caseBombe(int vie,Joueur joueurCourant);
	
	public void caseQuestion(String reaction,int vie,Joueur joueurCourant);
	
	public int poserQuestion(int numCase,String question,String reponse1,String reponse2);
	
	public void annoncerVainqueur(String nomVainqueur);
	
}
