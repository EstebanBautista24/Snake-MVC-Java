/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GlobalController;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author estudiantes
 */
public class Food implements Drawable{
    int x,y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Food(int x, int y) {
        this.x = x;
        this.y = y;
 
    }



    @Override
    public void draw(Graphics2D drawer) {
        drawer.setColor(new Color(219,73,73));
        drawer.fillOval(this.x*GlobalController.pixelSize, this.y*GlobalController.pixelSize, GlobalController.pixelSize, GlobalController.pixelSize);
    }

    
    
}
