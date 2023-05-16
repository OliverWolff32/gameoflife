public class State {
    

    Boolean[][] cells;

    public State() {
        cells = new Boolean[][]
    }

    public void changeCell(int row, int col) {
        cells[row][col] = !cells[row][col];
    }

    public boolean getCell(int row, int col) {
        return cells[row][col];
    }








    
}
