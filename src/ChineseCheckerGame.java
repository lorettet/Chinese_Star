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
	 * @throws UnexpestedNumberOfPlayerException when the number of player is different from 2,3,4 or 6 
	 */
	public ChineseCheckerGame(int nbrPlayers) throws UnexpectedNumberOfPlayerException
	{	
		this.nbrPlayers = nbrPlayers;
		this.tray = new Tray(nbrPlayers);
	}


	// TODO(done) detail comment (main algorithm)
	
	/**
	 * Play the Game
	 * 
	 * <current player is player 1>
	 * while (<game is not over>)
	 * {
	 * 		do
	 * 		{
	 * 			<ask current player for a move of a pawn>
	 *		}
	 *		while (<the move is not valid>
	 *      <execute move>
	 * 		<switch to next player>
	 * }
	 * 	 */
	public void Play()
	{
		
		
		if (this.nbrPlayers == 2)
		{
			int winner = 0;
			int currentPlayer = Tray.PLAYER_1;
			
			while (winner == 0)
			{
			/*
			do
			{
				//ask current player a move of a pawn
			}
			while (<the move is not valid)
			execute the move
			*/
			winner = this.tray.GameState(currentPlayer);
			currentPlayer = this.tray.NextPlayer(this.nbrPlayers, currentPlayer);
			}
		}
		
		if (this.nbrPlayers == 3)
		{
			//TODO
		}
		
		if (this.nbrPlayers == 4)
		{
			//TODO
		}
		
		if (this.nbrPlayers == 6)
		{
			//TODO
		}
	}
	
	

}
