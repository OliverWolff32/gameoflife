public class State {
    

    Boolean[][] cells;

    public State(int row, int col) {
        cells = new Boolean[row][col];
        // System.out.println(String.valueOf(row) + col);
    }

    public void changeCell(int row, int col) {
        cells[row][col] = !cells[row][col];
    }

    public boolean getCell(int row, int col) {
        return cells[row][col];
    }








    
}
