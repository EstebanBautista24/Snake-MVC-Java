/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.GlobalController.general;

import Model.Obstacle;
import View.DeadView;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Esteban
 */
public class ControllerAdapter implements Controllable{
private  static Random r ;
   public static ArrayList<Obstacle> obstacles;

    public static  void repaintDrawables(Graphics2D drawer) {
        for(int i=0; i<obstacles.size();i++){
            obstacles.get(i).draw(drawer);
        }
        
    }

    public static void start() {
        obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(20,1));
    }


    public static void revise() {
         r= new Random();
        int x=r.nextInt(34) + 1; 
        obstacles.add(new Obstacle(x,1));
    }


    public static void dead(int x,int y) {
        for(int i=0; i<obstacles.size();i++){
           if(obstacles.get(i).colision(x, y)){
           DeadView lost=new DeadView (general, true);
          lost.currentScore(Integer.toString(GlobalController.score));
          lost.setVisible(true);
           }
        }
    }
    
    
}
