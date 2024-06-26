/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dialogue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 *  @author Julie,Dina,Gabriel
 */
public class ImagePirate extends javax.swing.JPanel {

    /**
     * Creates new form ImagePirate
     */
    public ImagePirate() {
        initComponents();
    }

    
    private BufferedImage image;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.image != null) {
            int width = this.getWidth();
            int height = this.getHeight();
            g.drawImage(this.image, 0, 0, width, height, null);
        }
    }
    
    public void setImagePirate(BufferedImage image) {
        this.image = image;
    }
    
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
