package boundary;

/**
 *
 * @author Dina Tamboura 22113075
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class ImagePiratePanel extends JPanel {
    private BufferedImage image;

    public ImagePiratePanel() {
        // Initialiser le panel possiblement avec une image par défaut
        try {
        java.net.URI url = getClass().getResource("/Images/pirate.jpg").toURI();
        if (url != null) {
            var file = new File(url);
            this.image = ImageIO.read(file);
        } else {
            System.out.println("Erreur : le chemin de l'image est introuvable.");
        }
    } catch (URISyntaxException | IOException e) {
        System.out.println("Erreur lors du chargement de l'image initiale: " + e.getMessage());
    }
    }
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.image != null) {
            int width = this.getWidth();
            int height = this.getHeight();
            g.drawImage(this.image, 0, 0, width, height, null);
        }
    }
    public void setImage(File file) {
        try {
            BufferedImage newImage = ImageIO.read(file);
            this.image = newImage;
            repaint();
        } catch (IOException e) {
            System.out.println("Erreur lors du chargement de la nouvelle image: " + e.getMessage());
        }
    }

   
}

