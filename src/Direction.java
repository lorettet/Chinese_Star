/**
 * Define all the different directions
 * @author lorettet
 */
public enum Direction {
	UP_LEFT(-1,0),
	UP_RIGHT(-1,-1),
	LEFT(0,1),
	RIGHT(0,1),
	DOWN_LEFT(1,1),
	DOWN_RIGHT(1,0);
	
	/**
	 * the move on I axe
	 */
	private final int moveOnI;
	/**
	 * the move on J axe
	 */
	private final int moveOnJ;
	
	private Direction(int i, int j){
		this.moveOnI = i;
		this.moveOnJ = j;
	}

	public int getMoveOnI() {
		return this.moveOnI;
	}

	public int getMoveOnJ() {
		return this.moveOnJ;
	}
	
	
}
