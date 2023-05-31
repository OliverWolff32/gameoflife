import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;

public class GameOfLife {
    public static void main(String[] args){
        JFrame f = new JFrame();      
        JPanel panel = new BackgroundPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));    
        f.add(panel);


        panel.setMinimumSize(new Dimension(500,550));  
        panel.setVisible(true);
    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(500, 550));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }



    
    
}
