import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class BackgroundPanel extends JPanel implements MouseListener{
    boolean running = false;

    Color backgroundGray = new Color(125,125,125);
    Color darkerGray = new Color(75,75,75);
    Color white = Color.WHITE;
    Color black = Color.BLACK;
    Color startGreen = new Color(70, 225, 41);
    Color stopRed = new Color(230,0,0);
    Color clearYellow = new Color(230,230,0);

    State state = new State();

    public BackgroundPanel(FlowLayout flowLayout) {
        this.addMouseListener(this);
    }


    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(backgroundGray);
        g2d.fillRect(0, 0, 500,575);
        // full window background

        g2d.setColor(darkerGray);
        g2d.fillRect(0,500,500,75);
        // button bar background

        g2d.setColor(startGreen);
        g2d.fillRect(0,500,150,75);
        g2d.setColor(black);
        g2d.setFont(new Font("SansSerif", Font.BOLD, 30 ));
        g2d.drawString("START", 23,547);
        // start button

        g2d.setColor(stopRed);
        g2d.fillRect(175, 500, 150,75);
        g2d.setColor(black);
        g2d.drawString("STOP", 206, 547);
        // stop button

        g2d.setColor(clearYellow);
        g2d.fillRect(350, 500, 150, 75);
        g2d.setColor(black);
        g2d.drawString("CLEAR", 369,547);
        // clear button


    }

    public void drawBoard(boolean[][] state, Graphics g) {
        for(int i = 0; i < state.length; i++) {
            for(int j = 0; j < state[0].length; j++) {
                g.setColor(state[i][j] ? white : backgroundGray);
                g.fillRect(i * 10, j * 10, 10, 10);
                
            }
        }
    }



    @Override
    public void mousePressed(MouseEvent arg0) {
        int mx = arg0.getX();
        int my = arg0.getY();
        System.out.println("Click\n");
        if(mx >= 0 && mx <= 150 && my >= 475 && my <= 550) { // in start button
            running = true;
            System.out.println("Start\n");
        }
        if(mx >= 175 && mx <= 325 && my >= 475 && my <= 550) { // in stop button
            running = false;
            System.out.println("Stop\n");
        }
        if(mx >= 350 && mx <= 500 && my >= 475 && my <= 550) { // in clear button
            System.out.println("Clear\n");
            state.clearCells(); // clear state
            Graphics g = this.getGraphics();
            drawBoard(State.cells, g); // draw state
            g.dispose(); // only to be efficient - good practice
        }
        if(!running) {

        }
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {
        
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
        
    }
    @Override
    public void mouseClicked(MouseEvent arg0) {

    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
    
    }
}
