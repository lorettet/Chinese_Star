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
	 * @throws UnexpectedNumberOfPlayerException 
	 * @throws InvalidParameterPlayerException 
	 * 	 */
	public void play() throws InvalidParameterPlayerException, UnexpectedNumberOfPlayerException
	{

			Player currentPlayer = Player.PLAYER1;
			
			Position positionTest = new Position(10,10);
			Position positionTest2 = new Position(11,11);
			
			while (true)
			{
			
			do
			{
				
			}
			while (this.tray.movePawnTest(currentPlayer, positionTest, positionTest2));
			//execute the move
			this.tray.movePawn();
			//check if the game is finished
			if(this.tray.GameWonTest(this.nbrPlayers, currentPlayer)) break;
			currentPlayer = this.tray.NextPlayer(this.nbrPlayers, currentPlayer);
			}
	}


}
