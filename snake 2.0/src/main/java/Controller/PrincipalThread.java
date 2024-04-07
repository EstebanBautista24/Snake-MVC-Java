/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import static Controller.GlobalController.snake;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalThread implements Runnable {

    @Override
    public void run() {
        int move = 5;
        int moveObstacle = 5;
        while (GlobalController.active) {
            try {
                Thread.sleep(1000 / 60); // Snake movement frequency

                if (move == 0) {
                    snake.getSnake().get(0).move(); // Snake movement
                    if (moveObstacle == 0) {
                        for(int i=0; i<ControllerAdapter.obstacles.size();i++){
                           ControllerAdapter.obstacles.get(i).move(); 
                        }
                        // Obstacle movement
                        moveObstacle = 10; // Adjust this value to control the speed of obstacle movement
                    }
                    move = 5;
                }

                GlobalController.general.getTablero().repaint();
                move--;
                moveObstacle--; // Decrement the obstacle move counter
            } catch (InterruptedException ex) {
                Logger.getLogger(PrincipalThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
