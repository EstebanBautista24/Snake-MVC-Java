/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.GlobalController.snake;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author estudiantes
 */
public class DirectionController implements KeyListener{
    int CurrentDirection;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

     if(e.getKeyCode()==KeyEvent.VK_LEFT && CurrentDirection!=1){
            System.out.println("izq");
            snake.getSnake().get(0).setDirection(2);
            CurrentDirection=CurrentDirection = snake.getSnake().get(0).getDirection();
        }
     if(e.getKeyCode()==KeyEvent.VK_RIGHT && CurrentDirection!=2){
             snake.getSnake().get(0).setDirection(1);
              CurrentDirection=CurrentDirection = snake.getSnake().get(0).getDirection();
             
            
        }
          if(e.getKeyCode()==KeyEvent.VK_UP && CurrentDirection!=4){
               snake.getSnake().get(0).setDirection(3);
                CurrentDirection=CurrentDirection = snake.getSnake().get(0).getDirection();
            
        }
           if(e.getKeyCode()==KeyEvent.VK_DOWN && CurrentDirection!=3){
                snake.getSnake().get(0).setDirection(4);
                 CurrentDirection=CurrentDirection = snake.getSnake().get(0).getDirection();
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
