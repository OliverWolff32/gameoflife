public class State {
    

    Boolean[][] cells;

    public State(int row, int col) {
        cells = new Boolean[row][col];
        // System.out.println(String.valueOf(row) + col);
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

}
