import java.util.LinkedList;

/**
 * A game of Chinese checkers
 * rules -> http://www.mastersgames.com/rules/chinese-checkers-rules.htm
 */
public class ChineseCheckerGame
{
	 
	/**
	 * Number of players
	 */
	private GameMode gameMode;
	
	/**
	 * The Tray
	 * */
	private Tray tray;
	

	/**
	 * Create a game of Chinese Checker ready to be played i.e :
	 * The tray is set
	 * @throws UnexpestedNumberOfPlayerException when the number of player is different from 2,3,4 or 6 
	 */
	public ChineseCheckerGame(GameMode gameMode) throws UnexpectedNumberOfPlayerException
	{	
		this.gameMode = gameMode;
		this.tray = new Tray(gameMode.getNbrPlayer());
	}
	
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
			
			Position initPosition = new Position(10,10);
			Position endPosition = new Position(11,11);
			LinkedList<Position> moveList = new LinkedList<Position>();
			
			while (true)
			{
			
			do
			{
				//Ask current player a move of a pawn
				
			}
			while (!(this.tray.movePawnTest(moveList, currentPlayer)));
			//execute the move
			this.tray.movePawn(currentPlayer, initPosition, endPosition);
			//check if the game is finished
			if(this.tray.GameWonTest(this.gameMode.getNbrPlayer(), currentPlayer)) break;
			currentPlayer = this.tray.NextPlayer(this.gameMode.getNbrPlayer(), currentPlayer);
			}
			switch(currentPlayer){
			case PLAYER1: System.out.println("The player 1 win!"); break;
			case PLAYER2: System.out.println("The player 2 win!"); break;
			case PLAYER3: System.out.println("The player 3 win!"); break;
			case PLAYER4: System.out.println("The player 4 win!"); break;
			case PLAYER5: System.out.println("The player 5 win!"); break;
			case PLAYER6: System.out.println("The player 6 win!");
			}
	}
}
