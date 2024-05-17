package test;
/*
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import controller.*;
import dialogue.Case;
import entity.*;
import boundary.*;

	

public class TestUnitaires {
	private static ControlActiverCase controlActiverCase;
	private static ControlDeplacer controlDeplacer;
	private static Plateau plateau;
	private static Joueur joueur, j1,j2;
	private static ControlVerifierFin controlVerifierFin;
	private static Jeu jeu;
	
	
	@BeforeAll
	public static void init() {
		j1 = new Joueur("j1",null);
		j2 = new Joueur("j2",null);
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
				CaseNormal caseActuelle = plateau.getCase(i);
				if(plateau.getCase(i) instanceof CaseBombe) {
					int degats = ((CaseBombe) caseActuelle).getDegat();
					assertEquals(joueur.getVie()-degats,controlActiverCase.activerBombe(joueur, i));

				}
			}
		
		}
	 
	 @Test
		public void testDeplacementPion() {
		    Joueur joueur = new Joueur("Joueur1", null);
		    ControlDeplacer controlDeplacer = new ControlDeplacer();
		    
		    // Simuler le lancer de dé
		    int[] des = new int[]{3, 4}; // Par exemple, obtenir 3 et 4 comme résultat
		    int pas = des[0] + des[1]; // Somme des résultats des dés
		    
		    // Déplacer le joueur
		    int nouvellePosition = controlDeplacer.deplacerPirate(joueur, pas);
		    
		    // Vérifier que le joueur s'est déplacé correctement
		    assertEquals(8, nouvellePosition); // Si le joueur était à la case 1, il devrait être à la case 7 après un déplacement de 7 pas
		}
	 
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
	 
	 @Test
	    public void testQuestionQCM() {
	        // Création d'un plateau avec une case QCM
	        Plateau plateau = new Plateau(0, 30);

	        // Initialisation du contrôleur avec le plateau
	        ControlActiverCase controlActiverCase = new ControlActiverCase();
	        controlActiverCase.setPlateau(plateau);

	        // Simulation de la position du joueur sur une case QCM
	        int position = 1; // Supposons que la case QCM est à la position 1

	        // Récupération de la question pour la case QCM
	        String question = controlActiverCase.getQuestion(position);

	        // Assertion pour vérifier que la question retournée est correcte
	        assertNotNull(question);
	    }
	 
	 @Test
		public void testLimiteDeuxJoueurs() {
			// Initialiser le jeu en utilisant ControlLancerPartie
	        ControlLancerPartie controlLancerPartie = new ControlLancerPartie();
	        Jeu jeu = controlLancerPartie.initialiserJeu();
	        
	        // S'assurer que seuls les deux premiers joueurs sont pris en compte
	        assertEquals(2, jeu.getJoueurs().length);
		}
	 
	 @Test
	 public void testplayEffect() {
		 for(int i = 0;i<30;i++) {
				CaseNormal caseActuelle = plateau.getCase(i);
				if(plateau.getCase(i) instanceof CaseQCM) {
					CaseQCM c = (CaseQCM) caseActuelle;
					assertNotNull(controlActiverCase.playEffect(i, 0, joueur));
					
				}
			}
	 }
	 
	
		 
	@Test
	public void testVictoireJ1_0hp() {
		j1 = new Joueur("j1",null);
		j2 = new Joueur("j2",null);
		controlVerifierFin.setJoueurs(j1, j2);
		j2.perdreVie(5);
		assertEquals(controlVerifierFin.donnerVainqueur(),j1.getNom());
	}
	
	@Test
	public void testVictoireJ2_0hp() {
		j1 = new Joueur("j1",null);
		j2 = new Joueur("j2",null);
		controlVerifierFin.setJoueurs(j1, j2);
		j1.perdreVie(5);
		assertEquals(controlVerifierFin.donnerVainqueur(),j2.getNom());
	}
	
	@Test
	public void testVictoireJ1_case_finale() {
		j1 = new Joueur("j1",null);
		j2 = new Joueur("j2",null);
		j1.deplacerPirate(29);
		controlVerifierFin.setJoueurs(j1, j2);
		assertEquals(controlVerifierFin.donnerVainqueur(),j1.getNom());
	}
	
	@Test
	public void testVictoireJ2_case_finale() {
		j1 = new Joueur("j1",null);
		j2 = new Joueur("j2",null);
		j2.deplacerPirate(29);
		controlVerifierFin.setJoueurs(j1, j2);
		assertEquals(controlVerifierFin.donnerVainqueur(),j2.getNom());
	}
	
	@Test
	public void testVerifierDeplacement() {
		j1 = new Joueur("j1",null);
		assertTrue(controlDeplacer.verifierDeplacement(joueur, 0, 1));
		
		assertTrue(controlDeplacer.verifierDeplacement(joueur, 5, 6)); //Si je fais 5 pas j'arrive case 6
	}
	
	@Test
	public void testLancerDes() {
		int[] des = controlDeplacer.LancerDes();
		boolean isInf = 0<des[0] && des[0]<7 && 0<des[1] && des[1]<7;
		assertTrue(isInf);
		}
	
	@Test
	public void testJeu() {
		Joueur[] tabJ = {j1,j2};
		jeu = new Jeu(tabJ);
		assertEquals(jeu.getJoueurCourant(),j1);
		jeu.changerTour();
		assertEquals(jeu.getJoueurCourant(),j2);
	}
	
	
	
	

}
*/