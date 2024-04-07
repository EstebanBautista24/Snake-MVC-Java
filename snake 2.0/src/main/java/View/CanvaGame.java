/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.ControllerAdapter;
import Controller.DirectionController;
import Controller.GlobalController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CanvaGame  extends JPanel{
    JLabel background;
    public CanvaGame(){
        this.setMaximumSize(new Dimension(350,300));
        background=new JLabel(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.png")));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        GlobalController.repaintDrawables(g2d);
        ControllerAdapter.repaintDrawables(g2d);

    }


    
}
