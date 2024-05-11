package boundary;
import controller.*;
import entity.*;
import java.util.Scanner;

public class BoundaryJeuPirate implements IBoundary{
    
    private IActiverCase iActiverCase;
    private IDeplacerPirate iDeplacerPirate;
    private ILancerDe iLancerDe;
    private IVerifierFin iVerfierFin;
    
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

    public void setILancerDe (ILancerDe iLancerDe){
        this.iLancerDe = iLancerDe;
    }
    
    public void setDeplacerPirate(IDeplacerPirate iDeplacerPirate){
        this.iDeplacerPirate = iDeplacerPirate;
    }
    
}
