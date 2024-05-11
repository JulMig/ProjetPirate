package entity;

import java.util.Random;


public class De {
    private static Random random = new Random();
    
    public static int[] lancerDes(int nombreDes) {
        int[] resultats = new int[nombreDes];
        for (int i = 0; i < nombreDes; i++) {
            resultats[i] = random.nextInt(6) + 1;
        }
        return resultats;
    }
    
}
