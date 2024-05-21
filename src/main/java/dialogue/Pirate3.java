/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dialogue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

/**
 *
 * @author gabri
 */
public class Pirate3 extends javax.swing.JPanel {
    private boolean is_clicked = false;

    /**
     * Creates new form Pirate3
     */
    public Pirate3() {
        initComponents();
        this.setToolTipText("William");
        loadImage();
    }
    
    BufferedImage image;
    
    private void loadImage() {
        try {
            image = ImageIO.read(new File(getClass().getResource("/Images/homme_pirate_1.png").toURI()));
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

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(170, 170));
        setPreferredSize(new java.awt.Dimension(170, 170));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (SwingUtilities.isRightMouseButton(evt) && !is_clicked) {
            this.setBorder(new LineBorder(Color.red, 4));
            is_clicked = true;
        }
        else if (SwingUtilities.isRightMouseButton(evt) && is_clicked) {
            this.setBorder(new LineBorder(Color.black, 3));
            is_clicked = false;
        }
        else if (SwingUtilities.isLeftMouseButton(evt) && !is_clicked) {
            is_clicked = true;
            this.setBorder(new LineBorder(Color.blue, 4));
        }

        else if (SwingUtilities.isLeftMouseButton(evt) && is_clicked) {
            this.setBorder(new LineBorder(Color.black, 3));
            is_clicked = false;
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
