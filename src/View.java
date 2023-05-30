import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.*;
import javax.swing.*;



public class View 
extends JComponent 
implements MouseListener {

    private int width;
    private int height;

    public static boolean pendingClick = false;

    private int mouseX;
    private int mouseY;

    Boolean[][] cells = new Boolean[50][50];

    public void init(int w, int h) {
       
        View v = new View(w,h);
        
        
        JFrame f = new JFrame();
        // flowlayout removes padding around edges
        JPanel panelTop = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        //JPanel panelBot = new JPanel();
        //start = new JButton("START");
        f.add(panelTop);
        //f.add(panelBot);

        panelTop.setMinimumSize(new Dimension(w,h));
        panelTop.add(v);
        panelTop.setVisible(true);
        panelTop.addMouseListener(this);
        
        Graphics2D graphics = (Graphics2D)panelTop.getGraphics();

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


    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(130,130,130)); // paintbrush - needs to be changed before drawing anything a different color.

        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
        g2d.fill(r);
        //background
       
        g2d.setColor(new Color(175,175,175));
        Rectangle2D.Double square = new Rectangle2D.Double(0,500,500,50);
        g2d.fill(square);

        g2d.setColor(new Color(0,220,0));
        Rectangle2D.Double startButton = new Rectangle2D.Double(25, 500, 100, 50);
        g2d.fill(startButton);
    }


    @Override
    public void mousePressed(MouseEvent arg0) {
        mouseX = arg0.getX();
        mouseY = arg0.getY();
        pendingClick = true;
        System.out.printf("%d %d\n", mouseX, mouseY);
        paintSquare(getCellXOnClick(mouseX), getCellYOnClick(mouseY), graphics2D);
    }




    /**
     * 
     * @param cX cell x coord
     * @param cY cell y coord
     */
    public void paintSquare(int cX, int cY, Graphics2D g) {
        //PAINT HERE
        
        g.setColor(new Color(255,255,255));
        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, 10, 10);
        g.fill(r);
        
    }






    

    

    /**
     * SHOULD ONLY BE CALLED WHEN MOUSE IS IN THE CELL BOX
     * @param mx == mouse x pos in window
     * @return index of cell x
    **/
    public int getCellXOnClick(int mx) { 
        // 10px wide cells, 500px wide box = 50 cells wide
        return mx/10;
    }

    /**
     * SHOULD ONLY BE CALLED WHEN MOUSE IS IN THE CELL BOX
     * @param my == mouse y pos in window
     * @return index of cell y
    **/
    public int getCellYOnClick(int my) { 
        // 10px tall cells, 500px tall box = 50 cells tall
        return my/10;        
    }



    public void changeCell(int row, int col) {
        cells[row][col] = !cells[row][col];
    }

    public boolean getCell(int row, int col) {
        return cells[row][col];
    }










    /**
     * below are default getters/methods for mouselisteners
     * @return
     */
    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
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
    public void mouseReleased(MouseEvent arg0) {
    }
}
   