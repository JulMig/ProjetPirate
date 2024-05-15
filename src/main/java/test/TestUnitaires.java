package test;

/*import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import controller.*;
import entity.*;
import boundary.*;

	

public class TestUnitaires {
	private static ControlActiverCase controlActiverCase;
	private static ControlDeplacer controlDeplacer;
	private static Plateau plateau;
	private static Joueur joueur, j1,j2;
	private static ControlVerifierFin controlVerifierFin;
	
	
	
	@BeforeAll
	public static void init() {
		controlActiverCase = new ControlActiverCase();
		controlDeplacer = new ControlDeplacer();
		plateau = new Plateau(5,5);
		controlActiverCase.setPlateau(plateau);
		controlVerifierFin = new ControlVerifierFin();
		 controlVerifierFin.setJoueurs(j1,j2);
		
	}
	
	@Test
	void testPerdreVie() {
		joueur = new Joueur(null, null);
		int vieActuelle = controlActiverCase.perdreVie(joueur, 1);
		assertEquals(vieActuelle,4);
		
	}
	
	@Test
	void testPerdreVieMAX() {
		joueur = new Joueur(null, null);
		int vieActuelle = controlActiverCase.perdreVie(joueur, 5);
		assertEquals(vieActuelle,0);
		
	}
	
	@Test
	void testPerdreVieSUPMAX() {
		joueur = new Joueur(null, null);
		int vieActuelle = controlActiverCase.perdreVie(joueur, 8);
		assertEquals(vieActuelle,0);
	}
	
	@Test
	void testGagnerVie() {
		joueur = new Joueur(null, null);
		int vieAvant = controlActiverCase.perdreVie(joueur, 1);
		int vieActuelle = controlActiverCase.gagnerVie(joueur, 1);
		assertEquals(vieActuelle,5);	
	}

	@Test
	void testGagnerVieSUPMAX() {
		joueur = new Joueur(null, null);
		int vieActuelle = controlActiverCase.gagnerVie(joueur, 8);
		assertEquals(vieActuelle,5);
	}
	

	
	 @Test
	 void testDeplacerPirate() {
		 joueur = new Joueur(null, null);
		 assertEquals(joueur.getPositionCourante()+1,controlDeplacer.deplacerPirate(joueur, 1));
	 }
	 
	 @Test
	 void testDeplacerPirateMAX() {
		 joueur = new Joueur(null, null);
		 assertEquals(joueur.getPositionCourante()+27,controlDeplacer.deplacerPirate(joueur, 31));
	 }
	 
	 @Test
	 void testDeplacerPirateMIN() {
		 joueur = new Joueur(null, null);
		 assertEquals(joueur.getPositionCourante(),controlDeplacer.deplacerPirate(joueur, 0));
	 }
	 
	 @Test
	 void verifierFin() {
		 controlVerifierFin.setJoueurs(joueur, joueur);
		assertFalse(controlVerifierFin.verifierFin());	 
	 }
	 
	 @Test
	 void verifierFin0hp() {
		Joueur j1 = new Joueur(null,null);
		j1.perdreVie(5);
		controlVerifierFin.setJoueurs(j1, joueur);
		assertTrue(controlVerifierFin.verifierFin());	 
	 }
	 
	 @Test
		void testPlateau() {
		 
			for(int i = 0;i<30;i++) {
				joueur = new Joueur(null, null);
				Case caseActuelle = plateau.getCase(i);
				if(plateau.getCase(i) instanceof CaseBombe) {
					int degats = ((CaseBombe) caseActuelle).getDegat();
					assertEquals(joueur.getVie()-degats,controlActiverCase.activerBombe(joueur, i));

				}
			}
		
		}
	
	
	
	

}*/
