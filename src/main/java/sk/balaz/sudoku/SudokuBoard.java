package sk.balaz.sudoku;

import java.util.Arrays;

public class SudokuBoard implements Board {

	private static final int DEFAULT_ROW_SIZE = 9;
	
	private static final int DEFAULT_COLUMN_SIZE = 9;
	
	/** sudoku game board as 2D field */
	private int[][] gameBoard;
	
	
	public SudokuBoard(String puzzleString) {
		
		char[] charArray = puzzleString.toCharArray();
		int length = charArray.length;
		
		gameBoard = new int[DEFAULT_ROW_SIZE][DEFAULT_COLUMN_SIZE];
	}

	public SudokuBoard(int[][] gameBoard) {
		this.gameBoard = gameBoard;
	}

	public int[] getRow(int rowNumber) {
		return gameBoard[rowNumber];
	}

	public int[] getColumn(int columnNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public void printBoard() {
		for (int[] rows : gameBoard) {
			System.out.println(Arrays.toString(rows));
		}
	}
	
	private void checkPuzzleStringLength(String puzzleString) {
		int boardSize = DEFAULT_ROW_SIZE * DEFAULT_COLUMN_SIZE;
		
		char[] charArray = puzzleString.toCharArray();
		if(charArray.length != boardSize) {
			//throw new 
		}
	}
}
