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
        System.out.println("\nC'est le tour de " + joueurCourant.getNom());
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
    
    public void activerCase(int numCase, Joueur joueurCourant){
        TypeCase typeCase = iActiverCase.getTypeCase(numCase);
        
        switch (typeCase){
            case TypeCase.NORMAL : {
                System.out.println("Rien ne ce passe");
                break;
            } 
            case TypeCase.BOMBE : {
                System.out.println("UNE BOMBE !!!!");
                int vie = iActiverCase.activerBombe(joueurCourant, numCase);
                System.out.println("Ouch il vous reste " + String.valueOf(vie) + " point de vie");
                break;
            }
            case TypeCase.QCM : {
                System.out.println("Un évènement va avoir lieu");
                int rep = poserQuestion(numCase);
                System.out.println(iActiverCase.playEffect(numCase, rep, joueurCourant));
                break;
            }
        }
        
        iActiverCase = null;
    }
    
    public int poserQuestion(int numCase){
        System.out.println(iActiverCase.getQuestion(numCase));
        String[] reponses = iActiverCase.getReponses(numCase);
        System.out.println("0." + reponses[0]);
        System.out.println("1." + reponses[1]);
        
        int rep = -1;
        
        do{
            rep = scanner.nextInt();
        } while(rep != 0 && rep != 1);
        
        return rep;
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

    public void setIActiverCase(IActiverCase iActiverCase) {
        this.iActiverCase = iActiverCase;
    }
    
    
    
}
