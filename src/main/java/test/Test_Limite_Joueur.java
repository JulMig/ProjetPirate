/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_Fonctionnelle_use_case;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import controller.ControlLancerPartie;
import entity.Jeu;
import entity.Joueur;

/**
 *
 * @author diall
 */
public class Test_Limite_Joueur {
	@Test
	public void testLimiteDeuxJoueurs() {
		// Initialiser le jeu en utilisant ControlLancerPartie
        ControlLancerPartie controlLancerPartie = new ControlLancerPartie();
        Jeu jeu = controlLancerPartie.initialiserJeu();
        
        // S'assurer que seuls les deux premiers joueurs sont pris en compte
        assertEquals(2, jeu.getJoueurs().length);
	}
    
}
