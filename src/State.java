public class State {
    

    Boolean[][] cells;

    public State(int row, int col) {
        cells = new Boolean[row][col];
        // System.out.println(String.valueOf(row) + col);
    }

    
    /**
     * @param mx == mouse x pos in window
     * @return index of cell x
    **/
    public int getCellXOnClick(int mx) { 


        return -1;
    }



    public void changeCell(int row, int col) {
        cells[row][col] = !cells[row][col];
    }

    public boolean getCell(int row, int col) {
        return cells[row][col];
    }

}
