/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ControllerAdapter;
import Controller.GlobalController;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author estudiantes
 */
public class Obstacle implements Colisionable,Drawable,Movable{
    int x,y;
    
    @Override
    public boolean colision(int x, int y) {
    if((this.x==x || this.x+1==x || this.x+2==x || this.x+3==x || this.x+4==x ) && this.y==y ){
        return true;
    }else{
        return false;
    }
        
    }

    @Override
    public void draw(Graphics2D drawer) {
    drawer.setColor(Color.pink);
    drawer.fillRect(this.x*GlobalController.pixelSize,this.y*GlobalController.pixelSize,GlobalController.pixelSize*5, GlobalController.pixelSize);
   
    }

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

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void move() {
     this.y++;
     if(this.y==10){
           ControllerAdapter.revise();
        }
    }

    
    
    
}
