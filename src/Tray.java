/**
 * A tray of Chinese Checker
 * */
public class Tray {
	
	/**
	 * The default number of rows
	 * */
	private final static int DEFAULT_NUMBER_OF_ROWS = 17;
	/**
	 * The default number of columns
	 * */
	private final static int DEFAULT_NUMBER_OF_COLUMNS = 17;
	
	
	/**
	 * A table of plinth
	 * */
	private Plinth[][] plinth;
	

	
	
	public Tray() {
	
		this.plinth = new Plinth[DEFAULT_NUMBER_OF_ROWS][DEFAULT_NUMBER_OF_COLUMNS];
	}
	
	

}
