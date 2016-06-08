/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author fallm
 */
public class IhmPlateau extends Canvas{
    private BufferedImage fondPlateau;
    Observateur observateur;
    private BufferedImage pionJ1;
    private BufferedImage pionJ2;
    private BufferedImage pionJ3;
    private BufferedImage pionJ4;
    private BufferedImage pionJ5;
    private BufferedImage pionJ6;
    
    public IhmPlateau()  {
        super();
    }
    
     /**
     * Dessine le contenu du canvas, c'est-à-dire l'icone
     * @param g un contexte graphique
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        try {
            //PION DE 21x26 espacés de 2 pixels entre eux + y += 13px  pour superposer
            if (true) { //INTEGRER LA CONTRAINTE DU NOMBRE DE JOUEURS
                pionJ1 = ImageIO.read(new File("src/Data/pionRouge.png"));
                pionJ2 = ImageIO.read(new File("src/Data/pionBleu.png"));
                pionJ3 = ImageIO.read(new File("src/Data/pionVert.png"));
                pionJ4 = ImageIO.read(new File("src/Data/pionJaune.png"));
                pionJ5 = ImageIO.read(new File("src/Data/pionViolet.png"));
                pionJ6 = ImageIO.read(new File("src/Data/pionOrange.png"));
            }
            fondPlateau = ImageIO.read(new File("src/Data/plateau.jpg")); 

                        
            
        } catch (IOException ex) {
            Logger.getLogger(IhmPlateau.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(fondPlateau, 0, 0, (ImageObserver) observateur); //Background

        g.drawImage(pionJ1, 150, 150, (ImageObserver) observateur); 
        g.drawImage(pionJ2, 150, 163, (ImageObserver) observateur); 
        g.drawImage(pionJ3, 150, 176, (ImageObserver) observateur);
        g.drawImage(pionJ4, 173, 150, (ImageObserver) observateur);
        g.drawImage(pionJ5, 173, 163, (ImageObserver) observateur);
        g.drawImage(pionJ6, 173, 176, (ImageObserver) observateur);
       
     }
     
    /* public void dessinerImage(int x, int y, String chemin) {
        ImageIcon imageIcon = new ImageIcon(chemin);
        JLabel labelImage = new JLabel(imageIcon);
        
        labelImage.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
        labelImage.setLocation(x, y);
        labelImage.setOpaque(false);
        //this.add(labelImage);
        repaint();
    }*/
    
    
    
    
    
}
