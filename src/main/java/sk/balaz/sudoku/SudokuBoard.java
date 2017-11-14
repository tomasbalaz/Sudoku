package sk.balaz.sudoku;

import java.util.Arrays;

public class SudokuBoard implements Board {

	/** sudoku game board as 2D field */
	private int[][] gameBoard;

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
}
