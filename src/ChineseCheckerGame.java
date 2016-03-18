// TODO add a link to a description of the game (in english) //DONE
/**
 * A game of Chinese checkers
 * rules -> http://www.mastersgames.com/rules/chinese-checkers-rules.htm
 */
public class ChineseCheckerGame
{
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
	
	
	/**
	 * Number of players
	 */
	private int nbrPlayers;
	private Tray tray;
	

	// TODO fix comment (ask for advice) //DONE
	// TODO consider using an exception to avoid forcing a valid number of players //DONE
	/**
	 * Create a game of Chinese Checker ready to be played i.e :
	 * The tray is set
	 * The first player is allowed to play
	 * @throws UnexpestedNumberOfPlayerException when the number of player is different from 2,3,4 or 6 
	 */
	public ChineseCheckerGame(int nbrPlayers) throws UnexpectedNumberOfPlayerException
	{
		if (!(nbrPlayers <= 4 && nbrPlayers >= 2 && nbrPlayers == 6))
		{
			throw new UnexpectedNumberOfPlayerException();
		}
		
		
		this.nbrPlayers = nbrPlayers;
		this.tray = new Tray();
		
		if (nbrPlayers==2){
			// TODO
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


	// TODO fix comment (this is not only about a game and starting a game) //DONE
	/**
	 * Play the Game
	 * 	 */
	public void play()
	{
		
	}

}
