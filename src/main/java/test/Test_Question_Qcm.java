package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import controller.ControlActiverCase;
import controller.IActiverCase;
import entity.CaseNormal;
import entity.CaseQCM;
import entity.Joueur;
import entity.Plateau;

import org.junit.Test; // Importer la classe Test

public class Test_Question_Qcm {
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
}