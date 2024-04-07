/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GlobalController;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Snake implements Drawable{

    private ArrayList<BodyPart> snake;
    public Snake(){
        snake= new ArrayList<>();
        snake.add(new Head(10,15,new Color(91,135,89)));
        snake.add(snake.get(0).addBodyPart());
        snake.add(snake.get(0).addBodyPart());
        snake.add(snake.get(0).addBodyPart());

       
   
    }
    @Override
    public void draw(Graphics2D drawer) {
        for(int i=0;i<snake.size();i++){
            snake.get(i).draw(drawer);
        }
    }

    public ArrayList<BodyPart> getSnake() {
        return snake;
    }

    public void setSnake(ArrayList<BodyPart> snake) {
        this.snake = snake;
    }
    
}
