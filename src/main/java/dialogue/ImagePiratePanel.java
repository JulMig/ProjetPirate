package dialogue;

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

    public ImagePiratePanel(String path) {
        // Initialiser le panel possiblement avec une image par défaut
        setImage(path);
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
    public void setImage(String path) {
       try {
        image = ImageIO.read(new File(getClass().getResource(path).toURI()));
    } catch (URISyntaxException | IOException e) {
        System.out.println("Erreur lors du chargement de l'image initiale: " + e.getMessage());
    }
    }

   
}

