package Swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class ButtonOutline extends JButton{
    
    Color myblue = new Color(90,155,238);
    
    public ButtonOutline() { 
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0 , 5, 0));
        setBackground(Color.blue);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    
    @Override
    protected void paintComponent(Graphics g) { 
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawRoundRect(0, 0, width-1, height-1, height, height);
        super.paintComponent(g);
        
    }
}