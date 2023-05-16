import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class View extends JComponent{
    private int width;
    private int height;


    public View(int w, int h) {
        width = w;
        height = h;
    }

    

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(130,130,130)); // paintbrush - needs to be changed before drawing anything a different color.

        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
        g2d.fill(r);
        //background
       
        g2d.setColor(new Color(0,0,0));
        Rectangle2D.Double square = new Rectangle2D.Double(240,240,20,20);
        
        g2d.fill(square);
    }
   
}


