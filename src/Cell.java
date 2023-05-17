public class Cell {

    Boolean currentState;
    int numOfNeighbors;

    public Cell(boolean b) {
        currentState = b;
    }

    public void flipCell() {
        currentState = !currentState;
    }

    public boolean getCellValue() {
        return currentState;
    }

    public int countAdjCells(boolean[][] arr, int row, int col) {
        // logic here
        return -1;
    }


}
