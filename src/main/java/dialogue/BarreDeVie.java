/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dialogue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Yoann
 */
public class BarreDeVie extends javax.swing.JPanel {
    private Image image;
    ArrayList<String> lstImage = new ArrayList<>();
    int hp = 5;

    /**
     * Creates new form BarreDeVie
     */
    public BarreDeVie() throws URISyntaxException {
        try {
            // Charger l'image originale
            image = ImageIO.read(new File(getClass().getResource("/Images/5pv.png").toURI()));

        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'erreur ou fournir une image de secours
        }
        
        for(int i = 0;i<=5;i++){
            lstImage.add("/Images/"+i+"pv.png");
        }

        initComponents();
    }
    
     public void setHp(int hp){
        this.hp=hp;
    }
    
    public String getImage(){
        return lstImage.get(hp);
    }
    
    public void setVie(int hp) throws URISyntaxException, IOException{
            if(hp<=0){
                hp=0;
            }
            setImage(lstImage.get(hp));
        
    }
  
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

    int width = getWidth();
    int height = getHeight();

    // Dessine les parties de l'image
    g2.drawImage(image, 0,0, width, height, null);
    
    }
    
    public void setImage(String path) throws IOException, URISyntaxException{
        try {
            // Charger l'image originale
            image = ImageIO.read(new File(getClass().getResource(path).toURI()));

        } catch (IOException e) {
            e.printStackTrace();
            // Gérer l'erreur ou fournir une image de secours
        }
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
