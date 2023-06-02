import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;

public class GameOfLife {
    public static void main(String[] args){
        init();
    }

    public static void init() {
        JFrame f = new JFrame();      
        JPanel panel = new BackgroundPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));    
        f.add(panel);

        panel.setMinimumSize(new Dimension(500,550));       
    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // need to use getContentPane to ignore the title bar in the frame when resizing.
        f.getContentPane().setPreferredSize(new Dimension(500, 550));

        f.setResizable(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    
    
}
