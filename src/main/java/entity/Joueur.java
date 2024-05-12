package entity;

public class Joueur {
    private String nom;
    private int vie = 5;
    private int positionCourante = 1;
            
    public Joueur(String nom) {
        this.nom = nom;
        
    }
    
    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void perdreVie(int nbVie){
        vie -= nbVie;
        if (vie < 0){
            vie = 0;
        }
        System.out.println(vie);
        
    }
    
    public void gagnerVie(int nbVie){
        vie += nbVie;
        if(vie >= 5){
            vie = 5;
        }
        System.out.println(vie);
    }
    
    
    public int getPositionCourante() {
        return positionCourante;
    }
    
    private int calculerPosition(int nbPas){
        int newPosition = positionCourante + nbPas;
        int surplus = newPosition - 30;
        
        if (surplus > 0){
            newPosition = 30 - surplus;
        }
        
        return newPosition;
    }
    
    public int deplacerPirate(int nbPas) {
        // Déplacer le pirate en ajoutant le nombre de pas à la position actuelle
        this.positionCourante = calculerPosition(nbPas);
        return this.positionCourante; // Retourne la nouvelle position du pirate c'est num case
        
    }
    
    public boolean verifierDeplacement(int nbPas, int nbPasFait){
        return nbPasFait == calculerPosition(nbPas);
        }
    
    
    
}
