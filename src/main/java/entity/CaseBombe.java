package entity;
import java.util.Random;

public class CaseBombe extends CaseNormal{
    int degat;

    public CaseBombe() {
        Random random = new Random();
        degat = random.nextInt(1, 2);
    }

    public int getDegat() {
        return degat;
    }
    
}
