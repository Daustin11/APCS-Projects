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
import java.awt.Graphics;
import javax.swing.JFrame;

public class BullsEyeFrame extends JFrame{
    
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillOval(getWidth()/2-400, getHeight()/2-400, 800, 800);
        g.setColor(Color.white);
        g.fillOval(getWidth()/2-300, getHeight()/2-300, 600, 600);
        g.setColor(Color.black);
        g.fillOval(getWidth()/2-250, getHeight()/2-250, 500, 500);
        g.setColor(Color.white);
        g.fillOval(getWidth()/2-175, getHeight()/2-175, 350, 350);
        g.setColor(Color.black);
        g.fillOval(getWidth()/2-100, getHeight()/2-100, 200, 200);
        
    }
}