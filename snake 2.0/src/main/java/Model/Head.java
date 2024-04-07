/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ControllerAdapter;
import Controller.GlobalController;
import java.awt.Color;

public class Head extends BodyPart {

    public Head(int x, int y, Color color) {
        super(x, y, color);
         direction=1;
    }

    @Override
    public void move() {
        if (this.next != null) {
            next.move(x, y);
        }
       if(direction==1){ //derecha
           this.x++;
           if(this.x==GlobalController.board.getX()){
               this.x=0;
           }
        
       }
       else if(direction==2){ //izquierda
           this.x--;
           if(this.x==0){
               this.x=GlobalController.board.getX();
           }
       }
       else if(direction==3){ //arriba
           this.y--;
           if(this.y==0){
               this.y=GlobalController.board.getY();
           }
       }
       else if(direction==4){ //abajo
           this.y++;
           if(this.y==GlobalController.board.getY()){
               this.y=0;
           }
           
       }
        eat();
        GlobalController.dead(this.x, this.y);
        ControllerAdapter.dead(this.x, this.y);

    }   

    @Override
    public void move(int x, int y) {
        
    }

    @Override
    public void eat() {
        
        if(this.x==GlobalController.food.getX() && this.y==GlobalController.food.getY()){
          System.out.println("comido"); 
          GlobalController.snake.getSnake().add(GlobalController.snake.getSnake().get(0).addBodyPart());
          GlobalController.revise();
          GlobalController.score();
         
        }
        else{

        }
           
            
       
        
    }

    @Override
    public boolean colision(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
