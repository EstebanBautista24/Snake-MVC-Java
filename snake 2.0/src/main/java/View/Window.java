/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.DirectionController;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Estudiantes
 */
public class Window extends JFrame{
    private CanvaGame tablero = new CanvaGame();
    private ScoreCard score = new ScoreCard();
    public Window(){
        super("Snake 1.0");
        this.setBounds(0, 0, 700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(getTablero(),BorderLayout.CENTER);
        this.add(getScore(),BorderLayout.NORTH);
        this.setVisible(true);
                this.addKeyListener( new DirectionController());
        
    }
    public CanvaGame getTablero() {
        return tablero;
    }

    public void setTablero(CanvaGame tablero) {
        this.tablero = tablero;
    }

    public ScoreCard getScore() {
        return score;
    }

    public void setScore(ScoreCard score) {
        this.score = score;
    }

    
}
