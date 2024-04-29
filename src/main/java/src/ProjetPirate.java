/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package src;

import java.util.Random;


/**
 *
 * @author GBL4455A
 */
public class ProjetPirate {


    public int tirerDe(){
        Random r = new Random(); 
        return r.nextInt(6)+1;
    }
}
