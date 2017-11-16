package sk.balaz.sudoku;

import java.util.HashSet;
import java.util.Set;

public class FieldCandidates implements Candidates{

	private static final Integer MAX_NUMBER_SUDOKU_VALUE = 9;

	private Set<Integer> numbers = new HashSet<Integer>();

	private Set<Integer> rowCandidates = new HashSet<Integer>();

	private Set<Integer> columnCandidates = new HashSet<Integer>();

	private Set<Integer> blockCandidates = new HashSet<Integer>();

	public FieldCandidates() {
		inicializeNumbers();
	}

	public Set<Integer> getRowCandidates(Field[] row) {
		Set<Integer> candidates = new HashSet<Integer>();

		for (Field field : row) {
			rowCandidates.add(field.getFieldNumber());
		}
		candidates.addAll(numbers);
		candidates.removeAll(rowCandidates);

		return candidates;
	}

	public Set<Integer> getColumnCandidates(Field[] column) {
		Set<Integer> candidates = new HashSet<Integer>();

		for (Field field : column) {
			columnCandidates.add(field.getFieldNumber());
		}
		candidates.addAll(numbers);
		candidates.removeAll(columnCandidates);

		return candidates;
	}

	public Set<Integer> getBlockCandidates(Field[][] block) {
		Set<Integer> candidates = new HashSet<Integer>();

		for (int row = 0; row < block.length; row++) {
			for (int column = 0; column < block[row].length; column++) {
				Field field = block[row][column];
				blockCandidates.add(field.getFieldNumber());
			}
		}
		candidates.addAll(numbers);
		candidates.removeAll(blockCandidates);

		return candidates;
	}

	private void inicializeNumbers() {
		for (int number = 0; number <= MAX_NUMBER_SUDOKU_VALUE; number++) {
			numbers.add(number);
		}
	}
}
