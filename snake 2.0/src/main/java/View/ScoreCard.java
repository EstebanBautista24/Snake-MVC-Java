/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiantes
 */
public class ScoreCard extends JPanel{
    private JLabel score = new JLabel("Score : ");
    int point=0;
    private JLabel scoreF = new JLabel(Integer.toString(point));

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    public ScoreCard(){
        this.setMinimumSize(new Dimension(50,300));
        this.setLayout(new GridBagLayout());
        this.setBackground(new Color(188,174,118));
        this.score.setFont(new Font("Kristen ITC", Font.BOLD, 16));
        this.scoreF.setFont(new Font("Kristen ITC", Font.BOLD, 16)); 
        this.add(score);
        this.add(scoreF);
       
        
    }

    public JLabel getScore() {
        return score;
    }

    public void setScore(JLabel score) {
        this.score = score;
    }

    public JLabel getScoreF() {
        return scoreF;
    }

    public void setScoreF(JLabel scoreF) {
        this.scoreF = scoreF;
    }
    public void currentScore(String point){
        scoreF.setText(point);
        
    }
}
