package sk.balaz.sudoku;

import java.util.Set;

public interface Candidates {

	public Set<Integer> getRowCandidates(Field[] row);

	public Set<Integer> getColumnCandidates(Field[] column);

	public Set<Integer> getBlockCandidates(Field[][] block);

}
