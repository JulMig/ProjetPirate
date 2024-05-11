package essaie;
import entity.De;
public class ControlLancerDe implements ILancerDee{
    
    
    @Override
    public int getAleaDeVal(){
        return De.lancerDe();
    }
    
}
