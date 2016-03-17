// TODO add a link to a description of the game (in english)
/**
 * A game of Chinese checkers
 */
public class ChineseCheckerGame
{
	/**
	 * Number of players
	 */
	private int nbrPlayers;

	// TODO fix comment (ask for advice)
	// TODO consider using an exception to avoid forcing a valid number of players
	/**
	 * Constructor without parameters
	 */
	public ChineseCheckerGame(int nbrPlayers)
	{
		if (nbrPlayers <= 4 && nbrPlayers >= 2 && nbrPlayers == 6)
		{
			this.nbrPlayers = nbrPlayers;
		}
		else
		{
			// return error
		}
	}

	// TODO consider removing this method (ask why)
	/**
	 * Asks user how many players will play
	 */
	public int askNbrPlayer()
	{
	}

	// TODO fix comment (this is not only about a game and starting a game)
	/**
	 * Start a new Game set the tray fill each players' plinths with marbles
	 */
	public void play()
	{
	}

}
