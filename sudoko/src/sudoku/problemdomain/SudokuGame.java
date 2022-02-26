package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GamesState gamesState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GamesState gamesState, int[][] gridState) {
        this.gamesState = gamesState;
        this.gridState = gridState;
    }

    public GamesState getGamesState() {
        return gamesState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
