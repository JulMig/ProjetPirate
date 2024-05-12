package boundary;
import controller.*;
import entity.*;
import java.util.Scanner;

public class BoundaryJeuPirate implements IBoundary{
    
    private IActiverCase iActiverCase;
    private IDeplacerPirate iDeplacerPirate;
    private ILancerDe iLancerDe;
    private IVerifierFin iVerifierFin;
    
    private Scanner scanner = new Scanner(System.in);
    
    public void afficherJoueur(Joueur joueurCourant){
        System.out.println("C'est le tour de " + joueurCourant.getNom());
    }
	
    public int lancerDes(){
        
        System.out.println("Lancer le de ?");
        scanner.nextLine();
        
        int[] des = iLancerDe.LancerDes();
        
        System.out.println("Vous avez fait " + String.valueOf(des[0]) + " - " + String.valueOf(des[1]));
        
        iLancerDe = null;
        return des[0] + des[1];
    }

    public int deplacerPirate(Joueur joueurCourant, int nbPas){
        int nbPasFait;
        
        do {
            System.out.println("Vous etes sur la case " + String.valueOf(joueurCourant.getPositionCourante())+ ".Sur quelle case allez vous ?");
            nbPasFait = scanner.nextInt();
        } while (!iDeplacerPirate.verifierDeplacement(joueurCourant, nbPas, nbPasFait));
        
        System.out.println("Deplacement valide");
        
        int numCase = iDeplacerPirate.deplacerPirate(joueurCourant, nbPas);
        
        iDeplacerPirate = null;
        return numCase;
    }
    
    public void annoncerVainqueur(){
        System.out.println("Le nouveau capitaine du navire est " + iVerifierFin.donnerVainqueur());
        iVerifierFin = null;
    }
    
    public void setILancerDe (ILancerDe iLancerDe){
        this.iLancerDe = iLancerDe;
    }
    
    public void setIDeplacerPirate(IDeplacerPirate iDeplacerPirate){
        this.iDeplacerPirate = iDeplacerPirate;
    }
    
    public void setIVerifierFin(IVerifierFin iVerifierFin){
        this.iVerifierFin = iVerifierFin;
    }
    
}