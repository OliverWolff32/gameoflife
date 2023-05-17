import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;


public class View extends JComponent{
    private int width;
    private int height;

    public void init(int w, int h) {
       
        View v = new View(w,h);
        
        
        JFrame f = new JFrame();
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        f.add(panel);

        panel.setMinimumSize(new Dimension(w,h));
        panel.add(v);
        panel.setVisible(true);
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("a");
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(w, h));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public View(int w, int h) {
        width = w;
        height = h;
    }    


    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(130,130,130)); // paintbrush - needs to be changed before drawing anything a different color.

        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
        g2d.fill(r);
        //background
       
        g2d.setColor(new Color(175,175,175));
        Rectangle2D.Double square = new Rectangle2D.Double(0,500,500,50);
        
        g2d.fill(square);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    
   
}


