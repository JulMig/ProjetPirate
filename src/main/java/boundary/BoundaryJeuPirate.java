package boundary;
import controller.*;
import java.util.Scanner;

public class BoundaryJeuPirate implements IBoundary{
    ILancerDe iLancerDe;
    
    Scanner scanner = new Scanner(System.in);
    

    @Override
    public void setILancerDe(ILancerDe iLancerDe) {
        this.iLancerDe = iLancerDe;
    }
    
    @Override
    public int lancerDe(){
        int rep;
        
        do {
            System.out.println("Voulez vous lancer le de ?\n1.oui");
            rep = scanner.nextInt();
        } while(rep != 1);
        
        int val1 = iLancerDe.getAleaDeVal();
        int val2 = iLancerDe.getAleaDeVal();
        
        System.out.println("Vous avez fais : " + String.valueOf(val1) + " " + String.valueOf(val2));
        
        return val1 + val2;
    }
    
    
    
}
