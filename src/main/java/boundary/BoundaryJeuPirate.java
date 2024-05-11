package boundary;
import controller.*;
import entity.*;

public class BoundaryJeuPirate implements IBoundary{
    
    public void afficherJoueur(Joueur joueurCourant){
        System.out.println("C'est le tour de " + joueurCourant.getNom());
    }
	
    public void setILancerDe (ILancerDe ILancerDe){
        //TODO
    }
	
    public int lancerDes(){
        //TODO
        return 0;
    }
	
    public void setDeplacerPirate(IDeplacerPirate IDeplacerPirate){
        //TODO
    }
    
}
