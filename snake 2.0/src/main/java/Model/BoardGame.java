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
public class BoardGame implements Drawable{
    int x,y;

    public BoardGame(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void draw(Graphics2D drawer) {
        drawer.setColor(new Color(247,230,151));
        drawer.fillRect(0, 0, x*GlobalController.pixelSize, y*GlobalController.pixelSize);
        //Toolkit t = Toolkit.getDefaultToolkit ();
        //Image imagen = t.getImage ("src/main/Resources/Images/fondo.png");
        //drawer.drawImage (imagen, 0, 0,GlobalController.general);
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
    
}
