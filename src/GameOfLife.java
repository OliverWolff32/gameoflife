import java.awt.*;

import javax.swing.*;



public class GameOfLife {

    public static void setupWindow() {
        int w = 500;
        int h = 600;

        View v = new View(w,h);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setMinimumSize(new Dimension(w, h));
        f.add(v);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
            
        
    }

    public static void main(String[] args) throws Exception {
        setupWindow();
    }



}
