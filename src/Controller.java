public class Controller {
    private int w;
    private int h;

    State state = new State(w,h);
    View view = new View(w, h);

    public Controller(int row, int col) {
        w = row;
        h = col;
    }

    public void run() {
        view.init(w,h);
    }
}
