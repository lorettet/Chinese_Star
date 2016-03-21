/**
 * A game of Chinese checkers
 * rules -> http://www.mastersgames.com/rules/chinese-checkers-rules.htm
 */
public class ChineseCheckerGame
{

	// TODO(done) considering removing these constants

	
	/**
	 * Number of players
	 */
	private int nbrPlayers;
	
	// TODO(done) write comment
	/**
	 * The Tray
	 * */
	private Tray tray;
	

	/**
	 * Create a game of Chinese Checker ready to be played i.e :
	 * The tray is set
	 * The first player is allowed to play
	 * @throws UnexpestedNumberOfPlayerException when the number of player is different from 2,3,4 or 6 
	 */
	public ChineseCheckerGame(int nbrPlayers) throws UnexpectedNumberOfPlayerException
	{
		// TODO (done, check tray class)define min/max number of players as constants
		
		this.nbrPlayers=nbrPlayers;
		this.tray = new Tray(nbrPlayers);
	}


	// TODO detail comment (main algorithm)
	
	// TODO write (done) just after TODO next time, and not at the end of line ;-)
	/**
	 * Play the Game
	 * 	 */
	public void play()
	{
		
	}

}
