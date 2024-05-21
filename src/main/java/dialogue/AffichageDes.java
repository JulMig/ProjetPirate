/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dialogue;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author GBL4455A
 */
public class AffichageDes extends javax.swing.JPanel {

    /**
     * Creates new form De
     */
    BufferedImage[] images = new BufferedImage[6];
    BufferedImage imageAAfficherD1;
    BufferedImage imageAAfficherD2;
    Timer timer;
    int compteur = 0;
    int limite = 20;
    int currentIndex = 0;
    int nbAAfficherD1 = 0;
    int nbAAfficherD2 = 0;
 
    
    public AffichageDes() {
        initComponents();
        
    }

    public void Afficher(int nbD1, int nbD2){
        try {
            for (int i = 0; i < 6; i++) {
                String n = i+1 + "";
                images[i] = ImageIO.read(new File(getClass().getResource("/Images/"+n +".png").toURI()));
            }
            
                timer = new Timer(50, (ActionEvent e) -> {
                    imageAAfficherD1 = images[new Random().nextInt(6)];
                    imageAAfficherD2 = images[new Random().nextInt(6)];
                    repaint();
                    compteur++;
                    if(compteur > limite){
                        timer.stop();
                        imageAAfficherD1 = images[nbAAfficherD1];
                        imageAAfficherD2 = images[nbAAfficherD2];
                        repaint();
                    }
                    
                });
            
        } catch (IOException | java.net.URISyntaxException ex) {
            System.out.println("Erreur du chargement de l'image");
        }
        compteur = 0;
        nbAAfficherD1 = nbD1-1;
        nbAAfficherD2 = nbD2-1;
        System.out.println(timer);
        timer.start();
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
            .addGap(0, 301, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
  
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (imageAAfficherD1 != null && imageAAfficherD2 != null) {
            g.drawImage(imageAAfficherD1, 10, 10, this);
            g.drawImage(imageAAfficherD2, 150, 10, this);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
