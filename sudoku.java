import java.util.Arrays;


class Sudoku {
    private static final int SIZE = 9;     // size of the grid e.g. 9 -> 9x9
    private static final int DMAX = 9;     // max digit to be filled in e.g. 9
    private static final int BOXSIZE = 3;  // size of the boxes e.g. 3 -> 3x3
    int[][] grid = new int[][] {
            { 0, 6, 0,  0, 0, 1,  0, 9, 4 },
            { 3, 0, 0,  0, 0, 7,  1, 0, 0 },
            { 0, 0, 0,  0, 9, 0,  0, 0, 0 },
            { 7, 0, 6,  5, 0, 0,  2, 0, 9 },
            { 0, 3, 0,  0, 2, 0,  0, 6, 0 },
            { 9, 0, 2,  0, 0, 6,  3, 0, 1 },
            { 0, 0, 0,  0, 5, 0,  0, 0, 0 },
            { 0, 0, 7,  3, 0, 0,  0, 0, 2 },
            { 4, 1, 0,  7, 0, 0,  0, 8, 0 },
    };

    int solutionnr = 0; //solution counter

    void run() {
        //TODO starts the solving process.



        //END TODO
    }

    boolean givesConflict(int r, int  c, int d) {
        //TODO is there a conflict when we fill in d at position r,c?
        return rowConflict(r, d) || colConflict(c,d) || boxConflict(r, c, d);
            //END TODO

    }

    boolean rowConflict(int r, int d) {
        //TODO is there a conflict in row r when we fill in d?

        // Loop through row r's values
        for (int c = 0; c < SIZE; c ++) {
            // Check for equality to d
            if (grid[r][c] == d) {
                // Equality found? Then we have a conflict!
                return true;
            }
        }

        //END TODO
        return false;
    }

    boolean colConflict(int c, int d) {
        //TODO is there a conflict in column c when we fill in d?

        // Loop through column c's values
        for (int r = 0; r < SIZE; r ++) {
            // Check for equality to d
            if (grid[r][c] == d) {
                // Equality found? Then we have a conflict!
                return true;
            }
        }

        //END TODO
        return false;
    }

    boolean boxConflict(int rr, int cc, int d) {
        //TODO is there a conflict when we fill in d at position in the box of rr,cc?

        if(grid)


        //END TODO
        return false;
    }


    int[] findEmptySquare() {
        //TODO return the next empty square (See assignment).



        //END TODO
        return null;
    }

    void solve() {
        //TODO see (4)



        //END TODO
    }

    // print the grid, 0s are printed as spaces
    void print() {
        closeBar();

        for (int i = 0; i < 9; i++) {

            if(i%3==0 && i!=0){ horBar();                }
            StringBuilder row = new StringBuilder(19);
            row.append("|");

            for (int j = 0; j < 9; j++) {
                if(j%3==0&& j!=0){row.append("|");}
                row.append(grid[i][j]);
                if(j!=2 && j !=5 && j!=8){row.append(" ");}

            }
            row.append("|").append("\n");
            String rowString = row.toString();
            String rowSpace = rowString.replaceAll("0", " ");

            System.out.print(rowSpace);

        }
        closeBar();
    }

    public void closeBar() { //prints bar that either indicates the beginning or ending of a sudoku
        StringBuilder cBar = new StringBuilder(11);
        cBar.append("+");
        for(int x=0; x<17;x++){
            cBar.append("-");
        }
        cBar.append("+");
        System.out.println(cBar);

    }
    public void horBar(){ //prints horizontal separating bar with dashes
        StringBuilder hBar = new StringBuilder(19);
        for(int a = 0; a < 20; a++){
            hBar.append("-");
        }
        hBar.append("\n");
        System.out.print(hBar);
    }


    public static void main(String[] args) {
        new Sudoku().run();
    }
}
