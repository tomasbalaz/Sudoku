package sk.balaz.sudoku;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestFieldCandidates {

	private final Field[] expectedTestRow = new Field[] { new Field(0), new Field(4), new Field(5),
														  new Field(6), new Field(7), new Field(8),
														  new Field(9)
														  };
	
	private final Field[] expectedTestColumn = new Field[] { new Field(0), new Field(4), new Field(5),
			  								   new Field(6), new Field(7), new Field(8),
			  								   new Field(9)
											   };
	
	private final Field[] expectedTestBlock = new Field[] {new Field(0), new Field(9)};

	private Candidates candidates;

	private Field[] testRow;
	
	private Field[] testColumn;
	
	private Field[][] testblock;

	@Before
	public void setUp() {
		candidates = new FieldCandidates();
		testRow = new Field[] { new Field(1), new Field(2), new Field(3) };
		testColumn = new Field[] { new Field(1), new Field(2), new Field(3) };
		testblock = new Field[][]{ { new Field(1), new Field(2), new Field(3) },
								   { new Field(4), new Field(5), new Field(6) },
								   { new Field(7), new Field(8), new Field(8) }
								 };
	}

	@Test
	public void testGetRowCandidates() {
		Set<Integer> actual = candidates.getRowCandidates(testRow);
		Set<Integer> expected = arrayFieldToset(expectedTestRow);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetColumnCandidates() {
		Set<Integer> actual = candidates.getColumnCandidates(testColumn);
		Set<Integer> expected = arrayFieldToset(expectedTestColumn);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testGetBlockCandidates() {
		Set<Integer> actual = candidates.getBlockCandidates(testblock);
		Set<Integer> expected = arrayFieldToset(expectedTestBlock);
		
		assertEquals(expected, actual);
	}

	private Set<Integer> arrayFieldToset(Field[] testField) {
		Set<Integer> testSet = new HashSet<Integer>();
		for (Field field : testField) {
			testSet.add(field.getFieldNumber());
		}

		return testSet;
	}
	
}
