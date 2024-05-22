/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dialogue;

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
    private int numCase = 0;
    /**
     * Creates new form Case
     */
    public Case() {
        initComponents();
        loadImage("/Images/sable.png"); // Charge l'image lors de la création de la case
    }
    
    
    protected void loadImage(String path) {
        try {
            File file = new File(getClass().getResource(path).toURI());
            image = ImageIO.read(file);
            repaint();
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
        if(numCase != 0){
            g2d.drawString(String.valueOf(numCase),10,10);
        }
    }

    

    public void setNumCase(int numCase) {
        this.numCase = numCase;
    }
    
    public int getNumCase() {
        return numCase;
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