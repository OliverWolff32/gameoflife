public class Controller {
    private int w;
    private int h;

     
    View view;

    public Controller(int row, int col) {
        w = row;
        h = col;
        //state = new State(w/10,(h-50)/10); // 10px cells
        view = new View(w, h);
    }
    

    


    public void run() {
        view.init(w,h);
        
    }
}
