/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainFramr;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author ASUS
 */
public class Case extends javax.swing.JPanel {

    BufferedImage image;
    /**
     * Creates new form Case
     */
    public Case() {
        initComponents();
        loadImage(); // Charge l'image lors de la création de la case
    }
    
    
    private void loadImage() {
        try {
            File file = new File("C:\\Users\\ASUS\\Desktop\\Document_Fac\\L3\\projetPirate\\test-merge\\src\\main\\resources\\case.png");
            image = ImageIO.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   
     
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;     
        if (image != null) {
            
             g2d.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }      
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