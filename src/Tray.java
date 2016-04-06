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
	 * The minimum number of player
	 * */
	private final static int MIN_PLAYER = 2;
	
	/**
	 * The maximum number of player
	 * */
	private final static int MAX_PLAYER = 6;
	/**
	 * Value of a non-existent plinth
	 * */
	private final static int NON_EXISTENT_PLINTH = -1;
	
	/**
	 * Value of an empty plinth
	 * */
	private final static int EMPTY_PLINTH = 0;
	
	/**
	 * Value of the player 1 (blue)
	 * */
	private final static int PLAYER_1 = 1;
	
	/**
	 * Value of the player 2 (purple)
	 * */
	private final static int PLAYER_2 = 2;
	
	/**
	 * Value of the player 3 (red)
	 * */
	private final static int PLAYER_3 = 3;
	
	/**
	 * Value of the player 4 (orange)
	 * */
	private final static int PLAYER_4 = 4;
	
	/**
	 * Value of the player 5 (yellow)
	 * */
	private final static int PLAYER_5 = 5;
	
	/**
	 * Value of the player 6 (green)
	 * */
	private final static int PLAYER_6 = 6;
	
	
	// TODO write comment
	private int[][] tray;
	
	
		
	// TODO fix comment (ask for advice)
	// TODO fix implementation (ask for advice)
	/**
	 * Constructor without parameters
	 * */
	public Tray(int nbrPlayers) throws UnexpectedNumberOfPlayerException{
		
		this.tray = new int[DEFAULT_NUMBER_OF_ROWS][DEFAULT_NUMBER_OF_COLUMNS];
		
		if (!(nbrPlayers <= 4 && nbrPlayers >= MIN_PLAYER && nbrPlayers == MAX_PLAYER))
		{
			throw new UnexpectedNumberOfPlayerException();
		}
		
		if (nbrPlayers==2){
			
			for(int i=0; i>=16; i++){
				if (i!=4){
					this.tray[0][i]=NON_EXISTENT_PLINTH;
				}
				else{
					this.tray[0][i]=PLAYER_6;
				}
			}
			// TODO Création des autres lignes (pour certains nombre de joueurs plus rapide en colonnes)
		}
		
		if (nbrPlayers==3){
			// TODO
		}
		
		if (nbrPlayers==4){
			// TODO
		}
		
		if (nbrPlayers==6){
			// TODO
		}
	}

}
