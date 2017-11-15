package sk.balaz.sudoku;

/**
 * Instantions of the class {@code Field} represent Game field board of the Sudoku game.
 * 
 * @author tomas.balaz
 *
 */
public class Field {

	/** Default field number value which is used when fieldNumber is not set */
	private static final int DEFAULT_FIELD_NUMBER = 0;

	/** Field number value */
	private int fieldNumber = DEFAULT_FIELD_NUMBER;

	/**
	 * Set field number value
	 * 
	 * @param fieldNumber Field number value
	 */
	public void setFieldNumber(int fieldNumber) {
		if (isEmpty()) {
			this.fieldNumber = fieldNumber;
		}
	}
	
	/**
	 * Get field number value
	 * 
	 * @return Field number value
	 */
	public int getFieldNumber() {
		return fieldNumber;
	}

	/** Checks if field number value number is empty */
	private boolean isEmpty() {

		return (fieldNumber == DEFAULT_FIELD_NUMBER);
	}
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return ".";
		}
		else {
			return " " + getFieldNumber();
		}
	}
}
