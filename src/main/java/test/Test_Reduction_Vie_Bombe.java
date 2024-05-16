/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Fonctionnelle_use_case;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import controller.ControlActiverCase;
import entity.CaseBombe;
import entity.Joueur;
import entity.Plateau;

/**
 *
 * @author diall
 */
public class Test_Reduction_Vie_Bombe {
	
	@Test
    public void testReductionPointsDeVieBombe() {
        // Création d'un joueur avec une certaine quantité de points de vie
        Joueur joueur = new Joueur("Joueur1", null);

        // Conservation des points de vie du joueur avant de rencontrer la bombe
        int vieAvant = joueur.getVie();

        // Simulation de l'atterrissage sur une case bombe
        joueur.perdreVie(2);

        // Récupération des points de vie du joueur après avoir rencontré la bombe
        int vieApres = joueur.getVie();

        // Vérification que la vie a été réduite de manière aléatoire entre 1 et 4 points
        assertTrue(vieApres >= vieAvant - 4 && vieApres <= vieAvant - 1);
    }
}
