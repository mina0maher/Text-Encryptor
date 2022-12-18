/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv.UI.controls;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPasswordField;

/**
 *
 * @author maher
 */
public class JBasswordBox extends JPasswordField{
    public JBasswordBox (int size){
        super(size);
        setOpaque(false);
    }
    @Override
    protected void paintComponent (Graphics g ) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g ){
        g.setColor(Color.blue);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }
}
