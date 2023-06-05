public class State {
    static boolean[][] cells;

    int[][] dirs = {{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},};

    public State() {
        cells = new boolean[50][50];
        clearCells();
        setCellStart(0.15);
       // debug getAmtNeighbors(49,49);
    }

    public void clearCells() {
        for(int row = 0; row < cells.length; row++) {
            for(int col = 0; col < cells[0].length; col++){
                cells[row][col] = false;
            }
        }
    }
    
    public void setCellStart(double percentOn) {
        for(int row = 0; row < cells.length; row++) {
            for(int col = 0; col < cells[0].length; col++) {
                cells[row][col] = Math.random() < percentOn;
            }
        }

        // cells[25][25] = true;
        // cells[24][25] = true;
        // cells[24][24] = true;
        // cells[25][24] = true;
        // cells[27][25] = true;
        // cells[10][25] = true;
        // cells[36][25] = true;
        // cells[36][11] = true;
        // cells[49][25] = true;
        // cells[1][21] = true;
        // cells[1][1] = true;
        // cells[18][47] = true;

    }

    public void copyGameArray(boolean[][] newArr) {
        for(int row = 0; row < 50; row++) {
            for(int col = 0; col < 50; col++) {
                cells[row][col] = newArr[row][col];
            }
        }
    }

    public boolean shouldBeOn(boolean[][] arr, int row, int col) {
        if(getCell(arr, row, col) && (getAmtNeighbors(arr, row, col) == 2 || getAmtNeighbors(arr, row, col) ==3)) return true;
        if(!getCell(arr, row, col) && getAmtNeighbors(arr, row, col) == 3) return true;

        return false;
    }

    public int getAmtNeighbors(boolean[][] arr, int row, int col){
        int total = 0;
        boolean neighbor;
        int potentialRow;
        int potentialCol;
        for(int i = 0; i<dirs.length;i++){
            potentialRow = row + dirs[i][0];
            potentialCol = col + dirs[i][1];
            if(potentialRow >=0 && potentialRow < 50 
            && potentialCol >= 0 && potentialCol < 50){
            // if potential neighbor is within bounds
                neighbor = getCell(arr, potentialRow, potentialCol);
                if(neighbor) total++;
               // debug System.out.println("Detected row: " + String.valueOf(row + dirs[i][0]) + "  Detected col:  " + String.valueOf(col + dirs[i][1]) + " Detected val: " + cells[row + dirs[i][0]][col + dirs[i][1]]);
            }
        }

        return total;
    }

    public void flipCell(boolean[][] arr, int row, int col) {
        arr[row][col] = !arr[row][col];
    }

    public boolean getCell(boolean[][] arr, int row, int col) {
        return arr[row][col];
    }
}
