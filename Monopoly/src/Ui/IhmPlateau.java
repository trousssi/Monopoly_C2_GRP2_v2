/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

/**
 *
 * @author fallm
 */
public class IhmPlateau extends JPanel{
    private BufferedImage fondPlateau;
    /*private BufferedImage pionJ1;
    private BufferedImage pionJ2;
    private BufferedImage pionJ3;
    private BufferedImage pionJ4;
    private BufferedImage pionJ5;
    private BufferedImage pionJ6;*/
    public IhmPlateau()  {
        this.setLayout(new OverlayLayout(this));
        
        /*pionJ1 = ImageIO.read(new File("src/Data/pionViolet.png"));
        pionJ2 = ImageIO.read(new File("src/Data/pionRouge.png"));
        pionJ3 = ImageIO.read(new File("src/Data/pionBleu.png"));*/
        this.dessinerImage(0, 0, "src/Data/pionOrange.png");
        this.dessinerImage(25, 0, "src/Data/pionRouge.png");
        this.dessinerImage(50, 0, "src/Data/pionBleu.png");
        
        this.add(new JLabel(new ImageIcon("src/Data/plateau.jpg"))); // Plateau de jeu à afficher à la fin 

    }
    
    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondPlateau, 0, 0, null);
    }*/
     
    /*@Override
    public void paint(Graphics g)
     {
         super.paint(g);
         
        g.drawImage(pionJ1, 0, 0,  null);
     }*/
      
     public void dessinerImage(int x, int y, String chemin) {
        ImageIcon imageIcon = new ImageIcon(chemin);
        JLabel labelImage = new JLabel(imageIcon);
        
        labelImage.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
        labelImage.setLocation(x, y);
        labelImage.setOpaque(false);
        this.add(labelImage);
        repaint();
    }
    
    
    
    
    
}
