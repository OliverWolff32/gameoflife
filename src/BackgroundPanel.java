import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class BackgroundPanel extends JPanel implements MouseListener{
    Color backgroundGray = new Color(125,125,125);
    Color darkerGray = new Color(75,75,75);
    Color white = Color.WHITE;
    Color black = Color.BLACK;
    Color startGreen = new Color(70, 225, 41);
    Color stopRed = new Color(230,0,0);
    Color clearYellow = new Color(230,230,0);

    public BackgroundPanel(FlowLayout flowLayout) {
        
    }


    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(black);
        g2d.fillRect(0, 0, 500,550);
        // full window background

        g2d.setColor(darkerGray);
        g2d.fillRect(0,475,500,75);
        // button bar background

        g2d.setColor(startGreen);
        g2d.fillRect(0,475,150,75);
        g2d.setColor(black);
        g2d.setFont(new Font("SansSerif", Font.BOLD, 30 ));
        g2d.drawString("START", 23,522);
        // start button

        g2d.setColor(stopRed);
        g2d.fillRect(175, 475, 150,75);
        g2d.setColor(black);
        g2d.drawString("STOP", 206, 522);
        // stop button

        g2d.setColor(clearYellow);
        g2d.fillRect(350, 475, 150, 75);
        g2d.setColor(black);
        g2d.drawString("CLEAR", 369,522);
        // clear button


    }


    @Override
    public void mouseClicked(MouseEvent arg0) {
        
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {
        
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
        
    }
    @Override
    public void mousePressed(MouseEvent arg0) {

    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
    
    }
}
