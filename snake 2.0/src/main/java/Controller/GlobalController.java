/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BoardGame;
import Model.Food;
import Model.Obstacle;
import Model.Snake;
import View.DeadView;
import View.Window;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class GlobalController implements Controllable{
    private static Random r ;
    public static int score;
    public static Window general;
    public static int pixelSize=20;
    public static Snake snake;
    public static Boolean active;
    public static BoardGame board= new BoardGame(35,35);
    public static Food food = new Food(20,20);
    private static PrincipalThread  thread;
    private static Thread thread1;
 
    public static void start(){
       
        score=0;
        snake= new Snake();
        general = new Window();
        active=true;
        thread= new PrincipalThread();
        thread1 = new Thread(thread, "Hilo 1");
        thread1.start();
        
        

    }
    public static void restart(){
        active=false;
        thread1.stop();
        
        start();
        
    }
    public static void repaintDrawables(Graphics2D drawer){
        board.draw(drawer);
        snake.draw(drawer);
        food.draw(drawer);
        
    }
    public static void revise(){
        r= new Random();
        int x=r.nextInt(34) + 1; 
        int y=r.nextInt(29) + 1; 
        food.setX(x);
        food.setY(y); 
        
}
public static void dead(int x,int y){
    for(int i=1; i<snake.getSnake().size();i++){
        if(snake.getSnake().get(i).colision(x,y)){
          DeadView lost=new DeadView (general, true);
          lost.currentScore(Integer.toString(score));
          lost.setVisible(true);
        }
    }
      
}

public static void score(){
    score++;
    general.getScore().currentScore(Integer.toString(score));
    
}

    
    
    
}
