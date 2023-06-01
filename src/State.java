public class State {
    boolean[][] cells;

    int[][] dirs = {{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0}};

    public State() {
        cells = new boolean[50][50];
        for(int row = 0; row < cells.length; row++) {
            for(int col = 0; col < cells[0].length; col++){
                cells[row][col] = false;
            }
        }
    }

    public int getNeighbors(int row, int col){
        int total = 0;
        for(int i = 0; i<dirs.length;i++){
            
        }
        return -1;
    }

    public void flipCell(int row, int col) {
        cells[row][col] = !cells[row][col];
    }

    public boolean getCell(int row, int col) {
        return cells[row][col];
    }
}
