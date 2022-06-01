/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minesweeper;

import java.awt.Color;

/**
 *
 * @author Flash
 */
public class MineSweeperApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MineSweeperFrame f = new MineSweeperFrame();
        f.setBounds(0,0,1000,1000);
        //upper left x, upper left y, width, height        
        f.setBackground(Color.green);
        f.setVisible(true);
    }
    
}
