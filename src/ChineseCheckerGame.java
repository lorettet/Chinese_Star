/**
 * A game of Chinese checkers
 * rules -> http://www.mastersgames.com/rules/chinese-checkers-rules.htm
 */
public class ChineseCheckerGame
{
	/**
	 * Number of players
	 */
	private int nbrPlayers;
	
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
		this.nbrPlayers=nbrPlayers;
		this.tray = new Tray(nbrPlayers);
	}


	// TODO(done) detail comment (main algorithm)
	
	/**
	 * Play the Game
	 * 1st player play until his turn is finish and then the second player play and so on...
	 * the game ends when a player reaches the opposite side with all his marbles.
	 * 	 */
	public void play(int nbrPlayer)
	{
		if (nbrPlayer == 2)
		{
			//TODO
		}
		
		if (nbrPlayer == 3)
		{
			//TODO
		}
		
		if (nbrPlayer == 4)
		{
			//TODO
		}
		
		if (nbrPlayer == 6)
		{
			//TODO
		}
	}

}
