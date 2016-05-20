import java.util.LinkedList;


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
	
	/**
	 * Detect all the near position of the current position
	 * @return a list of position
	 */
	public LinkedList<Position> plinthRadar(){
		
		Direction[] allDirections = Direction.values();
		LinkedList<Position> neighbourPositionsList = new LinkedList<Position>(); 
		for(Direction direction : allDirections){
			neighbourPositionsList.add(this.getNeighborPosition(direction));
		} 
		return neighbourPositionsList;
	}
	
	/**
	 * Return the neighbor position of a position in function of the direction given
	 * @param Direction direction 
	 * @return the neighbor position
	 */
	public Position getNeighborPosition(Direction direction){
		return new Position(this.getI()+direction.getMoveOnI(),this.getJ()+direction.getMoveOnJ());
	}
}
