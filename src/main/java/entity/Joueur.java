package entity;

public class Joueur {
    private String nom;
    private int positionCourante = 1;
            
    public Joueur(String nom) {
        this.nom = nom;
        
    }
    
    public String getNom() {
        return nom;
    }
    public int deplacerPirate(int nbPas) {
        // Déplacer le pirate en ajoutant le nombre de pas à la position actuelle
        this.positionCourante += nbPas;
        return this.positionCourante; // Retourne la nouvelle position du pirate c'est num case
        
    }
    
    public boolean verifierDeplacement(int nbPas, int nbPasFait){
        int new_Position = this.positionCourante + nbPasFait;
           
        return (new_Position >= 0) && (new_Position <= nbPas);
        }
    
    
    
}
