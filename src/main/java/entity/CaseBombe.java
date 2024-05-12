package entity;
import java.util.Random;

public class CaseBombe extends Case{
    int degat;

    public CaseBombe() {
        Random random = new Random();
        degat = random.nextInt(1, 5);
    }

    public int getDegat() {
        return degat;
    }
    
}
