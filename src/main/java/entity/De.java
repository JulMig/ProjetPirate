/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Random;

/**
 *
 * @author Julie Mignotte
 */
public class De {
    private static Random random = new Random();
    
    public static int lancerDe(){
        return (random.nextInt(6))+1;
    }
    
}
