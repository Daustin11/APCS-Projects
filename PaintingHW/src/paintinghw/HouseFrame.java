/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintinghw;

/**
 *
 * @author 22brobdani
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;    
import javax.swing.*;

public class HouseFrame extends JFrame {
   public void paint(Graphics g){
       int sc = 20;
       g.setColor(Color.white);
       g.fillRect (0, 0, getWidth(), getHeight());
       g.setColor(Color.darkGray);
       g.fillRect (0*sc, 0*sc, 100*sc, 100*sc);
       g.setColor(Color.black);
       g.fillRect (10*sc, 10*sc, 10*sc, 10*sc);
       g.setColor(new Color(255, 255, 255, 128));
       g.fillRect (0*sc, 20*sc, 100*sc, 100*sc);
       g.setColor(Color.white);
       g.fillRect (14*sc, 16*sc, 2*sc, 4*sc);
       g.setColor(Color.orange);
       g.fillRect (25*sc, 18*sc, 2*sc, 2*sc);
       g.fillRect (29*sc, 18*sc, 2*sc, 2*sc);
       g.fillRect (33*sc, 18*sc, 2*sc, 2*sc);
       g.setColor(Color.white);
       g.fillRect (12*sc, 12*sc, 2*sc, 2*sc);
       g.setColor(Color.gray);
       g.fillRect (25*sc, 5*sc, 4*sc, 4*sc);       
       g.setColor(Color.white);
       g.fillRect (16*sc, 12*sc, 2*sc, 2*sc);
       g.setColor(Color.white);
       g.fillRect (14*sc, 16*sc, 2*sc, 4*sc);
       g.setColor(Color.black);
       g.fillPolygon(new int[] {9*sc, 15*sc, 21*sc}, new int[] {10*sc, 4*sc, 10*sc}, 3); 
    }

}
