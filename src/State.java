public class State {
    static boolean[][] cells;

    int[][] dirs = {{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},};

    public State() {
        cells = new boolean[50][50];
        clearCells();
        // debug: getNeighbors(5, 5);
    }

    public void clearCells() {
        for(int row = 0; row < cells.length; row++) {
            for(int col = 0; col < cells[0].length; col++){
                cells[row][col] = false;
            }
        }
    }
    
    public int getNeighbors(int row, int col){
        int total = 0;
        boolean neighbor;
        for(int i = 0; i<dirs.length;i++){
            if(row + dirs[i][0]>=0 && row + dirs[i][0] < 50 
            && col + dirs[i][1] >= 0 && col + dirs[i][1] < 50){
            // if potential neighbor is within bounds
                neighbor = getCell(row + dirs[i][0], col + dirs[i][1]);
                if(neighbor) total++;
            }
            // debug: System.out.println("Detected row: " + String.valueOf(row + dirs[i][0]) + "  Detected col:  " + String.valueOf(col + dirs[i][1]));
        }

        return total;
    }

    public void flipCell(int row, int col) {
        cells[row][col] = !cells[row][col];
    }

    public boolean getCell(int row, int col) {
        return cells[row][col];
    }
}
