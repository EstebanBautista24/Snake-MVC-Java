/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;

/**
 *
 * @author Estudiantes
 */
public class Body extends BodyPart{
    public Body(int x,int y, Color color){
        super(x,y,color);

    }
        @Override
    public void move(int x, int y) {
        if(this.next!=null){
            next.move(this.x,this.y);
        }
        this.x=x;
        this.y=y;
        
    }

    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }

    @Override
    public boolean colision(int x,int y) {
        if(this.x==x && this.y==y){
            return true;
        }
        else{
            return false;
        }
    }
    
}
