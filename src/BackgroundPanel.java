import java.awt.*;

import javax.swing.*;

public class BackgroundPanel extends JPanel {
    Color backgroundGray = new Color(125,125,125);


    public BackgroundPanel(FlowLayout flowLayout) {
        
    }


    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(backgroundGray);
        g2d.fillRect(0, 0, 500,550);
    }





}
