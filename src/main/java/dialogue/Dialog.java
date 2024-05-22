package dialogue;

import boundary.AdaptateurNoyauFonctionnel;
import boundary.IPirates;
import entity.Joueur;
import java.awt.image.BufferedImage;

/**
 *
 * @author Julie,Louis,Yoann,Mariama,Dina,Gabriel
 */
public class Dialog implements IPirates{
    
    private MainFrame frame;
    private AdaptateurNoyauFonctionnel adaptateur;
    
    public void finLancerDes(){
        adaptateur.finLancerDes();
    }
	
    public boolean verifierDeplacement(int caseArrivee){
        return adaptateur.verifierDeplacement(caseArrivee);
    }
    
    @Override
    public void indiquerTour(BufferedImage image, String nomPirate){
        frame.indiquerTour(image, nomPirate);
    }
	
    @Override
    public void debloquerDes(){
        frame.debloquerDes();
    }
	
    @Override
    public void afficherDes(int val1,int val2){
        frame.afficherDes(val1, val2);
    }
	
    @Override
    public void bloquerJetons(){
        frame.bloquerJetons();
    }
	
    @Override
    public void deplacerPirate(int joueurCourant){
        frame.deplacerPirate(joueurCourant);
    }
	
    @Override
    public void caseNormale(){
        frame.caseNormale();
    }
	
    @Override
    public void caseBombe(int vie,Joueur joueurCourant){
        String nom = joueurCourant.getNom();
        int pos = joueurCourant.getPositionCourante();
        int idJ = joueurCourant.getId();
        
        frame.caseBombe(vie, idJ, nom, pos);
    }
	
    @Override
    public void caseQuestion(String reaction,int vie,Joueur joueurCourant){
        String nom = joueurCourant.getNom();
        int pos = joueurCourant.getPositionCourante();
        int idJ = joueurCourant.getId();
        
        frame.caseQuestion(reaction, vie, idJ, pos, nom);
        
    }
	
    @Override
    public int poserQuestion(int numCase,String question,String reponse1,String reponse2){
        return frame.poserQuestion(numCase, question, reponse1, reponse2);
    }
	
    @Override
    public void annoncerVainqueur(String nomVainqueur){
        frame.annoncerVainqueur(nomVainqueur);
    }

    public void setAdaptateur(AdaptateurNoyauFonctionnel adaptateur) {
        this.adaptateur = adaptateur;
    }

    public void setFrame(MainFrame frame) {
        this.frame = frame;
    }
    
    
    
}
