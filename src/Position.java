
public class Position {

	/**
	 * The columns
	 */
	private int i;
	
	/**
	 * The rows
	 */
	private int j;
	
	/**
	 * Constructor of a Position
	 * @param i
	 * @param j
	 */
	public Position(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	/**
	 * Get i
	 * @return
	 */
	public int getI() {
		return i;
	}

	/**
	 * Get j
	 * @return
	 */
	public int getJ() {
		return j;
	}
	
	public boolean equals(Position position){
		if (this.getI()== position.getI() && this.getJ()== position.getJ()) return true;
		return false;
	}
}
