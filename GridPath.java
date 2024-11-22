public class GridPath {
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;
    public GridPath(int[][] grid){
        this.grid = grid;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        /* to be implemented in part (a) */
        if(col==grid[row].length-1) return new Location(row+1,col);
        else if(row==grid.length-1) return new Location(row,col+1);
        else return grid[row+1][col]<grid[row][col+1] ? new Location(row+1,col) :new Location(row,col+1);
    }

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        int sum = 0;
        while (row!= grid.length&&col!=grid[0].length){
            sum+=grid[row][col];
            Location loc = getNextLoc(row,col);
            row = loc.getRow();
            col = loc.getCol();
        }
        return sum;
    }
}