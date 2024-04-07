/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GlobalController;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Estudiantes
 */
public abstract class BodyPart  implements Movable,Drawable,Edible,Colisionable{
    protected int x,y;
    protected Color color;
    protected BodyPart next=null;
    protected int direction;

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BodyPart getNext() {
        return next;
    }

    public void setNext(BodyPart next) {
        this.next = next;
    }

    public BodyPart(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public BodyPart addBodyPart(){
        if(next!=null){
           return next.addBodyPart();
        }
        else{
            next=new Body(this.x,this.y,new Color(115, 182,113));
            return next;
        }
       
    }
@Override
public void draw(Graphics2D drawer){
    drawer.setColor(this.color);
    drawer.fillOval(x*GlobalController.pixelSize, y*GlobalController.pixelSize, GlobalController.pixelSize,GlobalController.pixelSize);
}

  

}
