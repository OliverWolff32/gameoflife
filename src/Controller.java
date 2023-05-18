public class Controller {
    private int w;
    private int h;

    State state = new State(w/10,(h-50)/10); // 10px cells
    View view = new View(w, h);

    public Controller(int row, int col) {
        w = row;
        h = col;
    }

    public void gameLoop() {
        
    }


    public void run() {
        view.init(w,h);
        gameLoop();
    }
}
