package essaie;
import java.util.Scanner;
import essaie.ILancerDee;

public class BoundaryJeuPirate implements IBoundary{
    private ILancerDee iLancerDe;
    
    Scanner scanner = new Scanner(System.in);
    

    @Override
    public void setILancerDe(ILancerDee iLancerDe) {
        this.iLancerDe = iLancerDe;
    }
    
    @Override
    public int lancerDe(){

        System.out.println("Voulez vous lancer le de ?");
        scanner.next();
        
        int val1 = iLancerDe.getAleaDeVal();
        int val2 = iLancerDe.getAleaDeVal();
        
        System.out.println("Vous avez fais : " + String.valueOf(val1) + " " + String.valueOf(val2));
        
        return val1 + val2;
    }
    
    
    
}
