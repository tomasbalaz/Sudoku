package sk.balaz.sudoku;

/**
 * Instantions of the class {@code Board} represent Game board of the Sudoku game. 
 * 
 * @author tomas.balaz
 *
 */
public interface Board {

	/**
	 * Returns row of the game board
	 *  
	 * @param rowNumber Row number 
	 * @return Row of the game board
	 */
	public int[] getRow(int rowNumber);

	/**
	 * Returns column of the game board
	 * 
	 * @param columnNumber Column number 
	 * @return Column of the game board
	 */
	public int[] getColumn(int columnNumber);

	/**
	 * Prints game board
	 * 
	 */
	public void printBoard();

}
