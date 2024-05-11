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
    
    
}
