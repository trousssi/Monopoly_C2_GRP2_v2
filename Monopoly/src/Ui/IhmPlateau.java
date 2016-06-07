/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
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
    private BufferedImage pion;
    
    public IhmPlateau() {
        this.setLayout(new OverlayLayout(this));
        this.add(new JLabel(new ImageIcon("src/Data/robot_monopoly.jpg")));
        
        
        
        this.add(new JLabel(new ImageIcon("src/Data/plateau.jpg"))); // Plateau de jeu à mettre à la fin 
 
        setPreferredSize(new Dimension(700, 570));
        this.setVisible(true);
        /*this.dessinerImage(0, 0, "src/Data/plateau.jpg");
        this.dessinerImage(120, 400, "src/Data/robot_monopoly.jpg");*/

    }
    
    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondPlateau, 0, 0, null);
    }*/
     
     public void paint(Graphics g)
     {
         super.paint(g);
     }
      
     public void dessinerImage(int x, int y, String chemin)
    {
        ImageIcon imageIcon = new ImageIcon(chemin);
        JLabel labelImage = new JLabel(imageIcon);
        
        labelImage.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
        labelImage.setLocation(x, y);
        labelImage.setOpaque(false);
        this.add(labelImage);
        repaint();
    }
    
    
    
    
    
}
