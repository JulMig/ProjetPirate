package controller;
import java.util.Random;

public class ControlLancerDe implements ILancerDe{
    Random random = new Random();
    
    @Override
    public int getAleaDeVal(){
        return (random.nextInt(6))+1;
    }
    
}
